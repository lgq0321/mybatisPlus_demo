package com.example.demo.filter;

import com.alibaba.fastjson.JSON;
import com.example.demo.constant.HttpConst;
import com.example.demo.constant.ResponseConst;
import com.example.demo.context.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * @version 1.0
 * @description: 全局过滤器
 * @author: liuguoquan
 * @time: 2020/1/19 15:12
 */
@Component
@Log4j2
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {
        log.debug("AuthenticationFilter------------------------------------------------------------------------------------------------->init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        RpcPermissionParam param = this.buildPermissionParam(req);
        //consul健康检查
        if (param.getUrl().contains("actuator/health") ||
                param.getUrl().contains("/pub/system/api-docs")
                || param.getUrl().contains("/swagger-ui.html")
                || param.getUrl().contains("/doc.html")
                || param.getUrl().contains("/webjars")
                || param.getUrl().contains("/swagger-resources")
                || param.getUrl().contains("/api-hz/call/callBackRecord")
                ) {
            request.setAttribute(HttpConst.SYSTEM_CONTEXT, SystemContextHolder.get());
            chain.doFilter(request, response);
        } else {
            //做鉴权
//            RpcAuthResult result = rpcAuthService.validPermission(param);
            RpcAuthResult result = new RpcAuthResult(201,"鉴权通过");
            RpcSystemContext rpcSystemContext = new RpcSystemContext();
            rpcSystemContext.setOrgId("1");
            rpcSystemContext.setPlatform("2");
            rpcSystemContext.setTenantId("3");
            rpcSystemContext.setUserId("4");
            result.setContext(rpcSystemContext);
            if (ResponseConst.SUCCESS.equals(result.getCode())) {
                //校验通过
                RpcSystemContext context = result.getContext();
                SystemContextHolder.set(new SystemContext(context.getTenantId(), context.getOrgId(), context.getUserId(), context.getPlatform()));
                request.setAttribute(HttpConst.SYSTEM_CONTEXT, SystemContextHolder.get());
                chain.doFilter(request, response);
            } else {
                int httpStatus = ResponseConst.SERVER_ERR.equals(result.getCode()) ? ResponseConst.SERVER_ERR : ResponseConst.BAD_REQUEST;
                //校验失败 返回对应的code message
                resp.setCharacterEncoding(StandardCharsets.UTF_8.toString());
                resp.setContentType(MediaType.APPLICATION_JSON_VALUE);
                resp.setStatus(httpStatus);
                PrintWriter writer = resp.getWriter();
                writer.write(JSON.toJSONString(result));
                writer.close();
            }
        }
    }

    private RpcPermissionParam buildPermissionParam(HttpServletRequest req) {
        return new RpcPermissionParam(
                req.getHeader(HttpConst.SSAT), req.getRequestURI(), req.getMethod(),
                req.getHeader(HttpConst.SSTT), req.getHeader(HttpConst.SSTO), req.getHeader(HttpConst.PLATFORM)
        );
    }

    @Override
    public void destroy() {
        log.debug("AuthenticationFilter------------------------------------------------------------------------------------------------->destroy");
    }
}
