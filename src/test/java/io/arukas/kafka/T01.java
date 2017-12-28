package io.arukas.kafka;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

public class T01 {

    public static void main(String[] args) {
        //String json = "{\"extData\":\"{\\\"openid\\\":\\\"o3KR4t3Uy12-xFFSukzmkYVKycvw\\\"}\",\"openid\":\"o3KR4t3Uy12-xFFSukzmkYVKycvw\",\"operType\":\"subscribe\"}";
        //D01 d01 = JSON.parseObject(json, D01.class);
        //System.out.println(d01);
        DD dd = new DD();
        Map<String, Object> extData = new HashMap<>();
        extData.put("username", "admin");
        extData.put("nickname", "管理员");
        dd.setExtData(extData);
        dd.setOpenid("aaaaaaaaaaabbbbbbbbbbbsdfsf");
        String jsonData = JSON.toJSONString(dd);
        System.out.println(jsonData);
        DD dd1 = JSON.parseObject(jsonData, DD.class);
        System.out.println(dd1.getExtData().get("username"));
    }



}
@Data
class DD{
    private String openid;
    private String operType;
    private Map<String, Object> extData;
}

