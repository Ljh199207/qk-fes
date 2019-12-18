package com.qwgas.fes.test;

import com.alibaba.fastjson.JSONObject;
import com.qwgas.fes.response.FesResponse;
import com.qwgas.fes.vo.param.MeterDataUpParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author ljh
 * @date 2019-12-05 15:42
 */
@RestController
public class TestController {
    /**
     * get方法测试
     * @return
     */
    @GetMapping("testGet")
    public TestEntity testGet() {
        TestEntity testEntity = new TestEntity();
        testEntity.setId("1");
        testEntity.setName("get");
        return testEntity;
    }

    /**
     * post方法
     * @return
     */
    @PostMapping("testPost")
    public TestEntity testPost(){
        TestEntity testEntity = new TestEntity();
        testEntity.setId("1");
        testEntity.setName("post");
        return testEntity;
    }


    /**
     * post 方法传值
     * @return
     */
    @PostMapping(value = "testPostParam",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String testPostParam(@RequestBody JSONObject jsonParam){
        System.out.println(jsonParam.toJSONString());
       // System.out.println("Post id:"+testEntity.getId());
      //  System.out.println("Post name:"+testEntity.getName());
        return "post succ";
    }


   /* *//**
     * post 方法传值
     * @param id
     * @param name
     * @return
     *//*
    @PutMapping("testPut")
    public String testPut(@RequestParam("id") String id, @RequestParam("name") String name){
        System.out.println("put id:"+id);
        System.out.println("put name:"+name);
        return "del succ";
    }
*/

    /**
     * del方法传值
     * @param id
     * @return
     */
    @DeleteMapping("testDel")
    public String testDel(@RequestParam("id") String id){
        System.out.println("del id:"+id);
        return "del succ";
    }


    /**
     * post 方法传值
     * @return
     */
    @PostMapping(value = "testPostParam2",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public FesResponse testPostParam1(@RequestBody JSONObject jsonParam){
        System.out.println(jsonParam.toJSONString());
        MeterDataUpParam meterDataUpParam =  JSONObject.parseObject(String.valueOf(jsonParam), MeterDataUpParam.class);
        System.out.println(meterDataUpParam);
        return new FesResponse().success().data(jsonParam);
    }


    /**
     * post 方法传值
     * @return
     */
    @PutMapping("testPut")
    public String testPut(@RequestBody TestEntity testEntity){
        System.out.println("put id:"+testEntity.getId());
        System.out.println("put name:"+testEntity.getName());
        return "testPut succ";
    }


}
