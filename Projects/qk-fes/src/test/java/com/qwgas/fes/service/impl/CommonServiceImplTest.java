package com.qwgas.fes.service.impl;

import com.qwgas.fes.Application;
import com.qwgas.fes.service.CommonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class CommonServiceImplTest {

    @Autowired
    CommonService commonService;

    @Test
    public void test() throws Exception {
       /* JSONObject jsonObject = new JSONObject();
        jsonObject.put("serviceId", "64513b948eba43f5891c80998438c194");
        jsonObject.put("serviceSecret", "0b8dba77f01d441da1063cd148135212");
        ResponseEntity object = commonService.getToken(jsonObject);
        String tok = Optional.ofNullable(object)
                .flatMap(obj->Optional.ofNullable(obj.getBody()))
                .flatMap(jsonObj->Optional.ofNullable(JSON.parseObject(jsonObj.toString()).getJSONObject("data")))
                .flatMap(jsonObj->Optional.ofNullable(jsonObj.getString("token")))
                .orElse("serviceId or serviceSecret is not correct");
        System.out.println(tok);
        System.out.println(object);*/
    }
}