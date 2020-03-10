package com.example.demo.config;

import com.example.demo.config.condition.NoodlesCondition;
import com.example.demo.config.condition.RiceCondition;
import com.example.demo.service.Food;
import com.example.demo.service.impl.Noodles;
import com.example.demo.service.impl.Rice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2020/1/3 18:02
 */
@Configuration
public class FoodConfig {
    @Bean("food")
    @Conditional(RiceCondition.class)
    Food rice() {
        return new Rice();
    }
    @Bean("food")
    @Conditional(NoodlesCondition.class)
    Food noodles() {
        return new Noodles();
    }
}
