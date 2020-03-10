package com.example.demo.config;

import com.example.demo.setting.RedisSetting;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2020/1/3 16:14
 */
@Component
@ConfigurationProperties(prefix = "redis" ,value = "redis")
public class RedisConfig {

    private List<RedisSetting> redisConfigs;

    public List<RedisSetting> getRedisConfigs() {
        return redisConfigs;
    }

    public void setRedisConfigs(List<RedisSetting> redisConfigs) {
        this.redisConfigs = redisConfigs;
    }
}

