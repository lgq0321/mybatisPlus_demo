package com.example.demo.config.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2020/1/3 18:16
 */
public class JavaMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.getEnvironment().setActiveProfiles("南方人");
        ctx.getEnvironment().setActiveProfiles("123");
        ctx.register(JavaConfig.class);
        ctx.refresh();
        Food food = (Food) ctx.getBean("food");
        System.out.println(food.showName());
    }
}
