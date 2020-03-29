package com.example.demo.rest;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuguoquan
 * @version 1.0
 * @description
 * @date 2020/3/16 16:16
 */
public class HttpSend {
    private static final String url = "https://wrudchui.lc-cn-n1-shared.com/1.2/rtm/";
    private static final String objectId = "5e6f37fbdd3c130070f1dcab";
    public static void main(String[] args) {
       //curl -X POST \
        //  -H "X-LC-Id: wrudChuiXqUrxr7Yicprh2GG-gzGzoHsz" \
        //  -H "X-LC-Key: n2iYSjVQfWQHtqCDhVn2CABK,master" \
        //  -H "Content-Type: application/json" \
        //  -d '{"from_client": "", "message": ""}' \
        //  https://API_BASE_URL/1.2/rtm/service-conversations/{conv_id}/broadcasts
        Map<String,Object> map = new HashMap<>();
        map.put("from_client",objectId);
        map.put("message","nihao1woshiceshi1");
        JSONObject jsonObject = new JSONObject(map);
        String toString = jsonObject.toString();
        //链式构建请求
        String result2 = HttpRequest.post(url+"service-conversations/"+objectId+"/broadcasts")
                //头信息，多个头信息多次调用此方法即可
                .header("X-LC-Id", "wrudChuiXqUrxr7Yicprh2GG-gzGzoHsz")
                .header("X-LC-Key", "n2iYSjVQfWQHtqCDhVn2CABK,master")
                .contentType("application/json")
                .charset("UTF-8")
                .body(toString)
                //表单内容
                .timeout(20000)
                //超时，毫秒
                .execute().body();
        System.out.println("result2:"+result2);
    }
}
