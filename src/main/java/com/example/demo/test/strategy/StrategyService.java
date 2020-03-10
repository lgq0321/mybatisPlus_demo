package com.example.demo.test.strategy;

import com.example.demo.util.ResultType;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2020/1/7 15:08
 */
public interface StrategyService {
    /**
     * 计算订单金额
     * @param money 订单原来金额
     * @return double 折扣之后的金额
     */
    double sale(long money);

    ResultType sale1(long money);

    ResultType sale2(long money);

}
