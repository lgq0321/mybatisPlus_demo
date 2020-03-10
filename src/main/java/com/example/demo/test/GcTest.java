package com.example.demo.test;

/**
 * @version 1.0
 * @description:
 * @author: liuguoquan
 * @time: 2020/1/7 10:47
 */
public class GcTest {
    public static void main(String[] args) {
        {
            byte[] waste = new byte[6 * 1024 * 1024];
        }
    }

}
