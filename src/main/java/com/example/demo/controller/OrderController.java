package com.example.demo.controller;


import com.example.demo.annotation.Result;
import com.example.demo.test.strategy.StrategyService;
import com.example.demo.util.ResultType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  订单 前端控制器
 * </p>
 *
 * @author liuguoquan
 * @since 2019-12-27
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    StrategyService strategyService;

    @GetMapping("/sale")
//    @Result
    public double sale() {
        return strategyService.sale(120);
    }

    @GetMapping("/sale1")
    @Result
    public ResultType sale1() {
        return strategyService.sale1(120);
    }

    @GetMapping("/sale2")
    @Result
    public ResultType sale2() {
        return strategyService.sale2(120);
    }
}

