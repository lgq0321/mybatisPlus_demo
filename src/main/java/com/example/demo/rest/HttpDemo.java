package com.example.demo.rest;

import cn.hutool.core.lang.Console;
import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuguoquan
 * @version 1.0
 * @description
 * @date 2020/3/16 15:44
 */
public class HttpDemo {
    private static final String url = "https://wrudchui.lc-cn-n1-shared.com/1.2/rtm/";
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("name","lgq测试创建服务号");
        JSONObject jsonObject = new JSONObject(map);
        String toString = jsonObject.toString();
        //链式构建请求
        String result2 = HttpRequest.post(url+"service-conversations")
                //头信息，多个头信息多次调用此方法即可
                .header("X-LC-Id", "wrudChuiXqUrxr7Yicprh2GG-gzGzoHsz")
                .header("X-LC-Key", "n2iYSjVQfWQHtqCDhVn2CABK,master")
                .contentType("application/json")
                .charset("UTF-8")
//                .body("name":"My First Chatroom")
                .body(toString)
                //表单内容
                .timeout(20000)
                //超时，毫秒
                .execute().body();
        System.out.println("result2:"+result2);
    }
}
