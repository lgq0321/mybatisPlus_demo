package com.example.demo.config;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/27 10:50
 */
@Configuration
@Component
public class CustomIdGenerator implements IdentifierGenerator {
    @Override
    public Long nextId(Object entity) {
        //实现自定义ID生成...
        return System.currentTimeMillis();
    }
    @Bean("myselfIdentifierGenerator")
    public IdentifierGenerator idGenerator() {
        return new CustomIdGenerator();
    }

}