package com.example.demo.test.strategy;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2020/1/7 14:48
 */

public interface Strategy {
    /**
     * 打折策略
     * @param money
     * @return
     */
    double compute(long money);

    /**
     * 会员类型
     * @return
     */
    String getType();
}
