package com.example.demo.config.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2020/1/3 18:03
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.getEnvironment().getSystemProperties().put("people", "南方人");
        ctx.getEnvironment().getSystemProperties().put("people", "456");
        ctx.register(FoodConfig.class);
        ctx.refresh();
        Food food = (Food) ctx.getBean("food");
        System.out.println(food.showName());
    }
}
