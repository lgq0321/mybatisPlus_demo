package com.example.demo.rest;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuguoquan
 * @version 1.0
 * @description
 * @date 2020/3/16 16:56
 */
public class Push {
    private static final String url = "https://wrudchui.lc-cn-n1-shared.com/";
    private static final String objectId = "4xykemUy58saxDunW2spu8";
    public static void main(String[] args) {
        //curl -X POST \
        //  -H "X-LC-Id: wrudChuiXqUrxr7Yicprh2GG-gzGzoHsz"          \
        //  -H "X-LC-Key: mJuOUkYJsTfjEPGC01j52nNJ"        \
        //  -H "Content-Type: application/json" \
        //  -d '{
        //        "push_time": "2015-06-28T00:51:13.931Z",
        //        "expiration_interval": 518400,
        //        "data": {
        //          "alert": "您未使用的代金券将于 2015 年 7 月 4 日过期。"
        //        }
        //      }' \
        //  https://API_BASE_URL/1.1/push
//        Map<String,Object> map = new HashMap<>();
//        map.put("push_time","2020-06-28T00:51:13.931Z");
//        map.put("data","你好，我是定时任务");
//        JSONObject jsonObject = new JSONObject(map);
//        String toString = jsonObject.toString();
//        //链式构建请求
//        String result2 = HttpRequest.post(url+"1.1/push")
//                //头信息，多个头信息多次调用此方法即可
//                .header("X-LC-Id", "wrudChuiXqUrxr7Yicprh2GG-gzGzoHsz")
//                .header("X-LC-Key", "mJuOUkYJsTfjEPGC01j52nNJ")
//                .contentType("application/json")
//                .charset("UTF-8")
//                .body(toString)
//                //表单内容
//                .timeout(20000)
//                //超时，毫秒
//                .execute().body();
//        System.out.println("result2:"+result2);
        //curl -X PUT \
        //  -H "X-LC-Id: wrudChuiXqUrxr7Yicprh2GG-gzGzoHsz"          \
        //  -H "X-LC-Key: mJuOUkYJsTfjEPGC01j52nNJ"        \
        //  -H "Content-Type: application/json" \
        //  -d '{
        //        "userObjectId": "<用户的 objectId>"
        //      }' \
        //  https://API_BASE_URL/1.1/installations/mrmBZvsErB
        Map<String,Object> map = new HashMap<>();
        map.put("userObjectId","yonghudeobjectid");
        JSONObject jsonObject = new JSONObject(map);
        String toString = jsonObject.toString();
        //链式构建请求
        String result2 = HttpRequest.post("https://wrudchui.lc-cn-n1-shared.com/1.1/installations/5e6f37fbdd3c130070f1dcab")
                //头信息，多个头信息多次调用此方法即可
                .header("X-LC-Id", "wrudChuiXqUrxr7Yicprh2GG-gzGzoHsz")
                .header("X-LC-Key", "mJuOUkYJsTfjEPGC01j52nNJ")
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
