package com.qwgas.fes.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.qwgas.fes.config.ApiParam;
import com.qwgas.fes.response.FesResponse;
import com.qwgas.fes.service.MeterDataUpService;
import com.qwgas.fes.vo.param.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * @author ljh
 * @date 2019-12-09 09:54
 */
@Service
public class MeterDataUpServiceImpl implements MeterDataUpService {

    /*@Resource
    private ApiParam apiParam;

    @Autowired
    private RestTemplate restTemplate;

    *//**
     * 抄表数据上报
     *
     * @param meterDataUpParam
     * @return
     *//*
    @Override
    public FesResponse meterDataUp(MeterDataUpParam meterDataUpParam) {
        String meterDataup = apiParam.getUrl() + apiParam.getMeterDataUp();
        //Object object = postForObject(ObjectToMap(meterDataUpParam), meterDataup);
        System.out.println(meterDataUpParam);
        return new FesResponse().success().data(meterDataUpParam);
    }


    @Override
    public FesResponse meterDataUpBatch(List<MeterDataUpParam> meterDataUpParams) {
        String meterDataUpBatch = apiParam.getUrl() + apiParam.getMeterDataUpBatch();
        Object object = postForObject(ObjectToMap(meterDataUpParams), meterDataUpBatch);
        System.out.println(object);
        return new FesResponse().success().data(object);
    }

    @Override
    public FesResponse meterDataSupplement(MeterDataSupplementParam meterDataSupplementParam) {
        String meterDataUpBatch = apiParam.getUrl() + apiParam.getMeterDataSupplement();
        Object object = postForObject(ObjectToMap(meterDataSupplementParam), meterDataUpBatch);
        System.out.println(object);
        return new FesResponse().success().data(object);
    }

    @Override
    public FesResponse sendAlarm(SendAlarmParam sendAlarmParam) {
        String meterDataUpBatch = apiParam.getUrl() + apiParam.getMeterDataSupplement();
        Object object = postForObject(ObjectToMap(sendAlarmParam), meterDataUpBatch);
        System.out.println(object);
        return new FesResponse().success().data(object);
    }

    @Override
    public FesResponse rechargeUp(RechargeUpParam rechargeUpParam) {
        String meterDataUpBatch = apiParam.getUrl() + apiParam.getMeterDataSupplement();
        Object object = postForObject(ObjectToMap(rechargeUpParam), meterDataUpBatch);
        System.out.println(object);
        return new FesResponse().success().data(object);
    }

    @Override
    public FesResponse parameterUp(ParameterUpParam parameterUpParam) {
        return null;
    }

    @Override
    public FesResponse openAccount(OpenAccountUpParam openAccountUpParam) {
        return null;
    }

    @Override
    public FesResponse cancelRecharge(CancelRechargeUpParam cancelRechargeUpParam) {
        return null;
    }

    @Override
    public FesResponse openVResutl(MeterInfoParam meterInfoParam) {
        return null;
    }

    @Override
    public FesResponse closeVResult(MeterInfoParam meterInfoParam) {
        return null;
    }

    @Override
    public FesResponse chargePriceResutl(RechargeParam rechargeParam) {
        return null;
    }

    public Map<String, String> ObjectToMap(Object jsonObject) {
        return JSONObject.parseObject(JSONObject.toJSONString(jsonObject), Map.class);
    }

    public Object postForObject(Map<String, String> map, String url) {
        MultiValueMap<String, String> map1 = new LinkedMultiValueMap<>();
        map.forEach((key, value) -> {
                    map1.add(key, value);
                }
        );
        HttpEntity request = new HttpEntity<>(map, getHttpHeaders());
        return restTemplate.postForObject(url, request, JSONObject.class);
    }

    public HttpHeaders getHttpHeaders() {
        String token = "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTU3NTYzODE3MSwiaWF0IjoxNTc1NjE2NTcxfQ.91WGVsYcuxwuriDMZZ3JxuIYxLUGwwcCgv4BuajjMkq-sRqfQn4mmhwyZXFxhrOn5qXhxJDL1GTEc5_P3BVVGA";
        String accessToke = "";
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        httpHeaders.setContentType(MediaType.APPLICATION_JSON_UTF8);
        httpHeaders.add("Authorization", token);
        httpHeaders.add("AccessToke", accessToke);
        return httpHeaders;
    }*/
}
