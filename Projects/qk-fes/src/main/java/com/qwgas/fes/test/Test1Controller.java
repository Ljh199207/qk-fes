package com.qwgas.fes.test;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author ljh
 * @date 2019-12-06 14:41
 */
@RestController
@RequestMapping
@Api(tags = "测试api")
public class Test1Controller {

    @ApiOperation(value = "测试情况")
    @PostMapping("/tes")
    public String  test(@RequestBody JSONObject jsonParam) {
        System.out.println(jsonParam.toJSONString());
        return jsonParam.toJSONString();
    }


}
