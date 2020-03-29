package com.example.demo.rest;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liuguoquan
 * @version 1.0
 * @description 查询所有订阅者
 * @date 2020/3/16 16:32
 */
public class QueryUser {
    private static final String url = "https://wrudchui.lc-cn-n1-shared.com/1.2/rtm/";
    private static final String objectId = "5e6f37fbdd3c130070f1dcab";
    public static void main(String[] args) {
        // curl -X GET \
        //        -H "X-LC-Id: wrudChuiXqUrxr7Yicprh2GG-gzGzoHsz" \
        //        -H "X-LC-Key: n2iYSjVQfWQHtqCDhVn2CABK,master" \
        //        https://API_BASE_URL/1.2/rtm/service-conversations/{conv_id}/subscribers/count
        //链式构建请求
        String result2 = HttpRequest.get(url+"service-conversations/"+objectId+"/subscribers/count")
                //头信息，多个头信息多次调用此方法即可
                .header("X-LC-Id", "wrudChuiXqUrxr7Yicprh2GG-gzGzoHsz")
                .header("X-LC-Key", "n2iYSjVQfWQHtqCDhVn2CABK,master")
                .contentType("application/json")
                .charset("UTF-8")
                //表单内容
                .timeout(20000)
                //超时，毫秒
                .execute().body();
        System.out.println("result2:"+result2);
    }
}
class Test{
    private static final String url = "https://wrudchui.lc-cn-n1-shared.com/";
    private static final String objectId = "5e6f37fbdd3c130070f1dcab";
    public static void main(String[] args) {
        //curl -X PUT \
        //  -H "X-LC-Id: wrudChuiXqUrxr7Yicprh2GG-gzGzoHsz"          \
        //  -H "X-LC-Key: mJuOUkYJsTfjEPGC01j52nNJ"        \
        //  -H "Content-Type: application/json" \
        //  -d '{
        //        "channels": [
        //          "customer"
        //        ]
        //      }' \
        //  https://API_BASE_URL/1.1/installations/mrmBZvsErB
        //
        Map<String,Object> map = new HashMap<>();
        List<String> customerList  =new ArrayList<>();
        customerList.add("customer");
        map.put("channels",customerList);
        JSONObject jsonObject = new JSONObject(map);
        String toString = jsonObject.toString();
        //链式构建请求
        String result2 = HttpRequest.get(url+"1.1/installations/"+objectId)
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
