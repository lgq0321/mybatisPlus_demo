package com.example.demo.rest;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liuguoquan
 * @version 1.0
 * @description
 * @date 2020/3/16 16:35
 */
public class Constant {
    public static void main(String[] args) {
        //curl -X POST \
        //  -H "X-LC-Id: wrudChuiXqUrxr7Yicprh2GG-gzGzoHsz" \
        //  -H "X-LC-Key: mJuOUkYJsTfjEPGC01j52nNJ" \
        //  -H "Content-Type: application/json" \
        //  -d '{
        //        "deviceType": "ios",
        //        "deviceToken": "abcdefghijklmnopqrstuvwzxyrandomuuidforyourdevice012345678988",
        //        "channels": [
        //          ""
        //        ]
        //      }' \
        //  https://API_BASE_URL/1.1/installations
        //
        Map<String,Object> map = new HashMap<>();
        map.put("deviceType","ios");
        map.put("deviceToken","abcdefghijklmnopqrstuvwzxyrandomuuidforyourdevice012345678988");
        map.put("channels",null);
        JSONObject jsonObject = new JSONObject(map);
        String toString = jsonObject.toString();
        //链式构建请求
        String result2 = HttpRequest.post("https://wrudchui.lc-cn-n1-shared.com/1.1/installations")
                //头信息，多个头信息多次调用此方法即可
                .header("X-LC-Id", "wrudChuiXqUrxr7Yicprh2GG-gzGzoHsz")
                .header("X-LC-Key", "mJuOUkYJsTfjEPGC01j52nNJ")
                .contentType("application/json")
                .charset("UTF-8")
//                .body("name":"My First Chatroom")
                .body(toString)
                //表单内容
                .timeout(20000)
                //超时，毫秒
                .execute().body();
        System.out.println("result2:"+result2);
        //result2:{"objectId":"uaqrLlb6nwTMaAOoQ3bBPmfN3n9F04ui","createdAt":"2020-03-16T09:15:14.431Z"}
    }
}
class test{
    public static void main(String[] args) {
        //curl -X GET \
        //  -H "X-LC-Id: wrudChuiXqUrxr7Yicprh2GG-gzGzoHsz" \
        //  -H "X-LC-Key: mJuOUkYJsTfjEPGC01j52nNJ" \
        //  https://API_BASE_URL/1.1/installations/51ff1808e4b074ac5c34d7fd
        String result2 = HttpRequest.get("https://wrudchui.lc-cn-n1-shared.com/1.1/installations/uaqrLlb6nwTMaAOoQ3bBPmfN3n9F04ui")
                //头信息，多个头信息多次调用此方法即可
                .header("X-LC-Id", "wrudChuiXqUrxr7Yicprh2GG-gzGzoHsz")
                .header("X-LC-Key", "mJuOUkYJsTfjEPGC01j52nNJ")
                .contentType("application/json")
                .charset("UTF-8")
                //表单内容
                .timeout(20000)
                //超时，毫秒
                .execute().body();
        System.out.println("result2:"+result2);
        //result2:{"valid":true,"updatedAt":"2020-03-16T09:15:14.431Z","channels":null,"deviceToken":"abcdefghijklmnopqrstuvwzxyrandomuuidforyourdevice012345678988","createdAt":"2020-03-16T09:15:14.431Z","deviceType":"ios","objectId":"uaqrLlb6nwTMaAOoQ3bBPmfN3n9F04ui"}
    }
}
class put{
    public static void main(String[] args) {
        //curl -X PUT \
        //  -H "X-LC-Id: wrudChuiXqUrxr7Yicprh2GG-gzGzoHsz" \
        //  -H "X-LC-Key: mJuOUkYJsTfjEPGC01j52nNJ" \
        //  -H "Content-Type: application/json" \
        //  -d '{
        //        "deviceType": "ios",
        //        "deviceToken": "abcdefghijklmnopqrstuvwzxyrandomuuidforyourdevice012345678988",
        //        "channels": [
        //          "",
        //          "foo"
        //        ]
        //      }' \
        //  https://API_BASE_URL/1.1/installations/51ff1808e4b074ac5c34d7fd
        Map<String,Object> map = new HashMap<>();
        map.put("deviceType","ios");
        map.put("deviceToken","abcdefghijklmnopqrstuvwzxyrandomuuidforyourdevice012345678988");
        map.put("channels", Arrays.asList("","foo"));
        JSONObject jsonObject = new JSONObject(map);
        String toString = jsonObject.toString();
        String result2 = HttpRequest.put("https://wrudchui.lc-cn-n1-shared.com/1.1/installations/uaqrLlb6nwTMaAOoQ3bBPmfN3n9F04ui")
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
        //result2:{"updatedAt":"2020-03-16T09:21:43.059Z","objectId":"uaqrLlb6nwTMaAOoQ3bBPmfN3n9F04ui"}
    }
}
class get{
    public static void main(String[] args) {
        //curl -X GET \
        //  -H "X-LC-Id: wrudChuiXqUrxr7Yicprh2GG-gzGzoHsz" \
        //  -H "X-LC-Key: mJuOUkYJsTfjEPGC01j52nNJ" \
        //  https://API_BASE_URL/1.1/installations
        String result2 = HttpRequest.get("https://wrudchui.lc-cn-n1-shared.com/1.1/installations")
                //头信息，多个头信息多次调用此方法即可
                .header("X-LC-Id", "wrudChuiXqUrxr7Yicprh2GG-gzGzoHsz")
                .header("X-LC-Key", "mJuOUkYJsTfjEPGC01j52nNJ")
                .contentType("application/json")
                .charset("UTF-8")
                //表单内容
                .timeout(20000)
                //超时，毫秒
                .execute().body();
        System.out.println("result2:"+result2);
    }
}