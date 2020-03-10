package com.example.demo.config;

import com.example.demo.service.Food;
import com.example.demo.service.impl.Noodles;
import com.example.demo.service.impl.Rice;
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
    @Profile("南方人")
    Food rice() {
        return new Rice();
    }
    @Bean("food")
    @Profile("北方人")
    Food noodles() {
        return new Noodles();
    }
}
