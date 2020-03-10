package com.example.demo.service.impl;

import com.example.demo.service.RoleOperation;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2019/12/30 10:10
 */
@Component
public enum RoleEnum implements RoleOperation {
    /**
     * 管理员
     */
    ADMIN {
        @Override
        public String op(String roleName) {
            return "我是管理员";
        }

    },
    /**
     * 超级管理员
     */
    SUPER_ADMIN {
        @Override
        public String op(String roleName) {
            return "我是超级管理员";
        }

    }
    ;
}
