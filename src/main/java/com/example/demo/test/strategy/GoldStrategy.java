package com.example.demo.test.strategy;

import com.example.demo.enums.StrategyEnum;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @description: 黄金会员策略
 * @author: liuguoquan
 * @time: 2020/1/7 14:50
 */
@Component
public class GoldStrategy implements Strategy {
    @Override
    public double compute(long money) {
        System.out.println("黄金会员 8折");
        return money * 0.8;
    }

    @Override
    public String getType() {
        return StrategyEnum.Gold.getCode();
    }
}
