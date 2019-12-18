package com.qwgas.fes.util;

import com.alibaba.fastjson.JSONObject;
import com.qwgas.fes.response.FesResponse;

public class FesResponseUtil {

    public static FesResponse fesResponse(String s) {
        JSONObject jsonObject;
        try {
            jsonObject = JSONObject.parseObject(s);
        } catch (Exception e) {
            return new FesResponse().fail().message(s);
        }
        FesResponse fesResponse = new FesResponse();
        if (jsonObject.containsKey("message")) {
            fesResponse.message(jsonObject.getString("message"));
        }
        if (jsonObject.containsKey("data")) {
            fesResponse.data(jsonObject.getString("data"));
        }
        if (jsonObject.containsKey("code") && ("0").equals(jsonObject.getString("code"))) {
            fesResponse.success();
        } else {
            fesResponse.fail();
        }
        return fesResponse;
    }
}
