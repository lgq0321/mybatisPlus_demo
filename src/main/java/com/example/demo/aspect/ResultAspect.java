package com.example.demo.aspect;

import com.alibaba.fastjson.JSON;
import com.example.demo.annotation.Result;
import com.example.demo.exection.GlobalException;
import com.example.demo.util.ResultType;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2020/1/13 14:17
 */
@Aspect
@Component
@Log4j2
@Profile({"test","prod"})
//配置那个环境生效 application.yml 文件内指定 spring.profiles.active 属性为 dev 或 test 才可以生效
public class ResultAspect {

    //1.定义切面
    @Pointcut(
//            "@annotation(org.springframework.web.bind.annotation.PostMapping) ||" +
//            " @annotation(org.springframework.web.bind.annotation.GetMapping) ||" +
            "@annotation(com.example.demo.annotation.Result) ")
    public void executionService(){
    }

    /**
     * @return void
     * @description 打印接口名、类名、方法名及参数名
     * @param: joinPoint
     * @param: t
     */
//    @Before(value = "@annotation(t)", argNames = "joinPoint,t")
//    public void doBefore(JoinPoint joinPoint, com.example.demo.annotation.Result t) throws Exception {
//        // 类名
//        String className = joinPoint.getTarget().getClass().getName();
//        // 方法名
//        String methodName = joinPoint.getSignature().getName();
//        // 参数名
//        Object[] args = joinPoint.getArgs();
//        StringBuilder sb = new StringBuilder();
//        if (args != null && args.length > 0) {
//            for (Object arg : args) {
//                sb.append(arg).append(", ");
//            }
//        }
//        log.info("接口 {} 开始被调用, 类名: {}, 方法名: {}, 参数名为: {} .",
//                t.desc(), className, methodName, sb.toString());
//    }

    @Before(value = "executionService()")
    public void doBefore(JoinPoint joinPoint) {
        //新增线程ID标识，用于日志跟踪
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        //获取请求的request
        assert attributes != null;
        HttpServletRequest request = attributes.getRequest();
        //获取所有请求的参数，封装为MethodSignature对象
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        //获取被拦截的方法
        Method method = methodSignature.getMethod();
        //获取被拦截的方法名
        String methodName = method.getName();
        log.info("AOP begin ,请求开始方法  :{}", method.getDeclaringClass() + "." + methodName + "()");
        //获取所有请求参数key和value
        // String keyValue = getReqParameter(request);
        log.info("请求url = {}", request.getRequestURL().toString());
        log.info("请求方法 = {}", request.getMethod());
        log.info("请求资源uri = {}", request.getRequestURI());
        log.info("接口实际参数为：{}", Arrays.toString(joinPoint.getArgs()));
    }

    @Around("executionService()")
    public ResultType around(ProceedingJoinPoint point){
        long startTime = System.currentTimeMillis();
        log.info("---HandleResultAspect--Around的前半部分----------------------------");
        Object result;
        try {
            log.info("---HandleResultAspect--Around的后半部分----------------------------");
            // 执行切点。point.proceed 为方法返回值 这里面继续执行调用的方法
            result = point.proceed();
            // 打印出参
            log.info("接口原输出内容: {}", result);
            // 执行耗时
            log.info("执行耗时：{} ms", System.currentTimeMillis() - startTime);
            return ResultType.builder().code(100).data(result).build();
        } catch (Throwable throwable) {
            log.error(throwable);
            throw new GlobalException("系统繁忙请稍后再试!");
        }
    }
    /**
     * 方法调用之后
     * @param result 返回结果
     */
    @AfterReturning(returning = "result", pointcut = "executionService()")
    public ResultType afterReturn(Object result){
        if(result!= null){
            log.info("返回值 = {}", result.toString());
            ResultType<Object> resultType = new ResultType<>(result);
            log.info("返回值 = {}", resultType.toString());
//            throw new GlobalException("你错了");
        }
        result = new ResultType<>(result);
        return new ResultType<>(result);
    }

    @After("executionService()")
    public void after(){
        log.info("方法执行完了");
    }

    @AfterThrowing(throwing = "throwable", pointcut = "executionService()")
    public void afterThrowing(Throwable throwable) {
        log.info("After throwing...", throwable);
    }

    @AfterReturning(pointcut = "@annotation(t)", returning = "res")
    public void afterReturn(Result t, Object res) {
        log.info("接口 {} 被调用已结束, 接口最终返回结果为: {} .",
                t.desc(), JSON.toJSONString(res));
    }
}
