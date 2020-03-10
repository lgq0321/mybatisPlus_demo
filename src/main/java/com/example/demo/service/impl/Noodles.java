package com.example.demo.service.impl;

import com.example.demo.service.Food;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2020/1/3 17:57
 */
public class Noodles implements Food {
    @Override
    public String showName() {
        return "面条";
    }
}
