package com.example.demo.test.strategy;

import com.example.demo.enums.StrategyEnum;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @description: 普通会员策略
 * @author: liuguoquan
 * @time: 2020/1/7 14:49
 */
@Component
public class OrdinaryStrategy implements Strategy {
    @Override
    public double compute(long money) {
        System.out.println("普通会员 不打折");
        return money;
    }
    @Override
    public String getType() {
        return StrategyEnum.ORDINARY.getCode();
    }
}