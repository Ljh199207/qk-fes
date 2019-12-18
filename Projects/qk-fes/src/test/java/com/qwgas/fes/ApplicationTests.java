package com.qwgas.fes;

import com.qwgas.fes.service.MeterDataUpService;
import com.qwgas.fes.test.RunService;
import com.qwgas.fes.vo.param.MeterDataUpParam;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class ApplicationTests {

    @Autowired
    RunService runService;


    @Autowired
    MeterDataUpService meterDataUpService;

    @Test
    public void getTest() throws URISyntaxException {
        //  runService.getTestGet();
        //runService.getTestPost();
        //runService.getTestPostParam();
          runService.getTestPut();
        //  runService.getTestDel();
    }

    @Test
    public void MeterDataUpServiceImplTest() {
        MeterDataUpParam meterDataUpParam = new MeterDataUpParam();
        meterDataUpParam.setMeterNo("123");
        meterDataUpParam.setCurrentCellVoltage("test");
        meterDataUpParam.setFactoryCode("fact");

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        String localTime = df.format(time);
        meterDataUpParam.setMeterTime(localTime);

        meterDataUpParam.setMeterType("21");

      //  meterDataUpService.meterDataUp(meterDataUpParam);
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
    }
}
