package com.qwgas.fes.controller;

import com.alibaba.fastjson.JSONObject;
import com.qwgas.fes.Application;
import com.qwgas.fes.response.FesResponse;
import com.qwgas.fes.service.CommonService;
import com.qwgas.fes.service.MeterDataService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class MeterDataControllerTest {

    @Autowired
    MeterDataService meterDataService;
    @Autowired
    CommonService commonService;

    @Test
    public void getToken() throws Exception {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("serviceId", "64513b948eba43f5891c80998438c194");
        jsonObject.put("serviceSecret", "0b8dba77f01d441da1063cd148135212");
        FesResponse token = commonService.getToken(jsonObject);

        System.out.printf(token.toString());
    }



}