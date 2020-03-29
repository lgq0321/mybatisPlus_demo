package com.example.demo.config.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Objects;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2020/1/3 18:01
 */
public class RiceCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return Objects.equals(context.getEnvironment().getProperty("people"), "123");
    }
}