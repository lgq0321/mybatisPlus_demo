package com.example.demo.annotation;

import java.lang.annotation.*;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2020/1/13 14:15
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Result {
    String desc() default "create17";
}
