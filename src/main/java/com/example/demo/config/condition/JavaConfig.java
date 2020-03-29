package com.example.demo.config.condition;

import com.example.demo.config.condition.Food;
import com.example.demo.config.condition.Noodles;
import com.example.demo.config.condition.Rice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2020/1/3 18:16
 */
@Configuration
public class JavaConfig {
    @Bean("food")
    @Profile("456")
    Food rice() {
        return new Rice();
    }
    @Bean("food")
    @Profile("123")
    Food noodles() {
        return new Noodles();
    }
}
