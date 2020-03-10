package com.example.demo.enums;

import com.example.demo.util.EnumBehavior;

/**
 * @version 1.0
 * @description: 会员枚举类
 * @author: liuguoquan
 * @time: 2020/1/7 14:55
 */
public enum StrategyEnum implements EnumBehavior {
    /**
     * 普通会员
     */
    ORDINARY("ordinary","普通会员,不打折"),
    /**
     * 白银会员
     */
    Silver("silver","白银会员,优惠50元"),
    /**
     * 黄金会员
     */
    Gold("gold","黄金会员,8折"),
    /**
     * 白金会员
     */
    Platinum("platinum","白金会员,优惠50元,再打7折")

    ;
    private String code;
    private String message;

    StrategyEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }}
