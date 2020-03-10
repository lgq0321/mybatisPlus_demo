package com.example.demo.test.strategy;

import com.example.demo.exection.GlobalException;
import com.example.demo.util.ResultType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @version 1.0
 * @description: 订单实现类
 * @author: liuguoquan
 * @time: 2020/1/7 14:52
 */
@Service
public class StrategyServiceImpl implements StrategyService{

    private Map<String, Strategy> concurrentHashMap;

    @Autowired
    public StrategyServiceImpl(List<Strategy> strategies){
        concurrentHashMap = strategies.stream().collect(Collectors.toMap(Strategy::getType, strategy ->strategy));
    }

    @Override
    public double sale(long money) {
//        if(true){
//            throw new GlobalException("你错了");
//        }
        String type = "silver";
        Strategy strategy = concurrentHashMap.get(type);
        return strategy.compute(money);
    }

    @Override
    public ResultType sale1(long money) {
        String type = "silver";
        Strategy strategy = concurrentHashMap.get(type);
        return ResultType.builder().data(strategy.compute(money)).build();
    }

    @Override
    public ResultType sale2(long money) {
        throw new GlobalException("我错了");
    }
}
