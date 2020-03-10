package com.example.demo.test.strategy;

import com.example.demo.enums.StrategyEnum;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @description: 白银会员策略
 * @author: liuguoquan
 * @time: 2020/1/7 14:49
 */
@Component
public class SilverStrategy implements Strategy {
    @Override
    public double compute(long money) {
        System.out.println("白银会员 优惠50元");
        return money - 50;
    }
    @Override
    public String getType() {
        return StrategyEnum.Silver.getCode();
    }
}
