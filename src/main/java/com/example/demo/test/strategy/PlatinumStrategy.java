package com.example.demo.test.strategy;

import com.example.demo.enums.StrategyEnum;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @description: 白金会员策略
 * @author: liuguoquan
 * @time: 2020/1/7 14:50
 */
@Component
public class PlatinumStrategy implements Strategy {
    @Override
    public double compute(long money) {
        System.out.println("白金会员 优惠50元，再打7折");
        return (money - 50) * 0.7;
    }
    @Override
    public String getType() {
        return StrategyEnum.Platinum.getCode();
    }
}