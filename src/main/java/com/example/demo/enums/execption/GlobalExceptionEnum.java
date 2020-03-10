package com.example.demo.enums.execption;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2020/1/13 15:25
 */
@AllArgsConstructor
@NoArgsConstructor
public enum GlobalExceptionEnum {
    /**
     *
     */
    UNKNOW_ERROR(-1, "未知错误"),
    /**
     *
     */
    NULL_EXCEPTION(-2, "空指针异常：NullPointerException"),
    /**
     *
     */
    INVALID_EXCEPTION(1146, "无效的数据访问资源使用异常：InvalidDataAccessResourceUsageException");

    public Integer code;

    public String msg;

}
