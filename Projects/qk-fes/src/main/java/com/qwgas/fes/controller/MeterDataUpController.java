package com.qwgas.fes.controller;

import com.alibaba.fastjson.JSONObject;
import com.qwgas.fes.response.FesResponse;
import com.qwgas.fes.service.CommonService;
import com.qwgas.fes.service.MeterDataUpService;
import com.qwgas.fes.vo.mapToStruct.MeterDataUpConvter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ljh
 * @date 2019-12-09 14:27
 */
@Api(tags = "获取token")
@RestController
@RequestMapping("/fes")
public class MeterDataUpController {

    private CommonService commonService;
    @Autowired
    public MeterDataUpController(CommonService commonService) {
        this.commonService = commonService;
    }

    /**
     * post 上传抄表数据
     *
     * @return
     *//*
    @ApiOperation("上传抄表数据")
    @PostMapping(value = "meterDataUp")
    public FesResponse meterDataup(@RequestBody MeterDataUpParam meterDataUpParam) {
        meterDataUpService.meterDataUp(meterDataUpParam);
        return new FesResponse().success();
    }


    *//**
     * post 批量上传抄表数据
     *
     * @return
     *//*
    @ApiOperation("批量上传抄表数据")
    @PostMapping(value = "meterDataUpBatch", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public FesResponse meterDataUpBatch(@RequestBody JSONArray jsonObject) {
        List<GatherInstanceDetail> gatherInstanceDetails = JSON.parseObject(String.valueOf(jsonObject), new TypeReference<List<GatherInstanceDetail>>() {
        });
        List<MeterDataUpParam> meterDataUpParams = meterDataUpConvter.domain2dto(gatherInstanceDetails);
        meterDataUpService.meterDataUpBatch(meterDataUpParams);
        return new FesResponse().success();
    }

    *//**
     * post 补抄数据上报
     *
     * @return
     *//*
    @ApiOperation("补抄数据上报")
    @PostMapping(value = "meterDataSupplement", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public FesResponse meterDataSupplement(@RequestBody JSONObject jsonObject) {
        MeterDataSupplementParam meterDataSupplementParam = JSONObject.parseObject(String.valueOf(jsonObject), MeterDataSupplementParam.class);
        meterDataUpService.meterDataSupplement(meterDataSupplementParam);
        return new FesResponse().success();
    }

    *//**
     * post 报警信息上报
     *
     * @return
     *//*
    @ApiOperation("报警信息上报")
    @PostMapping(value = "sendAlarm", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public FesResponse sendAlarm(@RequestBody SendAlarmParam sendAlarmParam) {
       // SendAlarmParam sendAlarmParam = JSONObject.parseObject(String.valueOf(jsonObject), SendAlarmParam.class);
        meterDataUpService.sendAlarm(sendAlarmParam);
        return new FesResponse().success();
    }


    *//**
     * post 充值结果上报
     *
     * @return
     *//*
    @ApiOperation("充值结果上报")
    @PostMapping(value = "rechargeUp", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public FesResponse rechargeUp(@RequestBody JSONObject jsonObject) {
        RechargeUpParam rechargeUpParam = JSONObject.parseObject(String.valueOf(jsonObject), RechargeUpParam.class);
        meterDataUpService.rechargeUp(rechargeUpParam);
        return new FesResponse().success();
    }

    *//**
     * post 参数读取信息上报
     *
     * @return
     *//*
    @ApiOperation("参数读取信息上报")
    @PostMapping(value = "parameterUp", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public FesResponse parameterUp(@RequestBody JSONObject jsonObject) {
        ParameterUpParam parameterUpParam = JSONObject.parseObject(String.valueOf(jsonObject), ParameterUpParam.class);
        meterDataUpService.parameterUp(parameterUpParam);
        return new FesResponse().success();
    }

    *//**
     * post 指令表具请求开通
     *
     * @return
     *//*
    @ApiOperation("指令表具请求开通")
    @PostMapping(value = "openAccount", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public FesResponse openAccount(@RequestBody JSONObject jsonObject) {
        OpenAccountUpParam openAccountUpParam = JSONObject.parseObject(String.valueOf(jsonObject), OpenAccountUpParam.class);
        meterDataUpService.openAccount(openAccountUpParam);
        return new FesResponse().success();
    }

    *//**
     * post 取消充值结果上报
     *
     * @return
     *//*
    @ApiOperation("取消充值结果上报")
    @PostMapping(value = "cancelRecharge", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public FesResponse cancelRecharge(@RequestBody JSONObject jsonObject) {
        CancelRechargeUpParam cancelRechargeUpParam = JSONObject.parseObject(String.valueOf(jsonObject), CancelRechargeUpParam.class);
        meterDataUpService.cancelRecharge(cancelRechargeUpParam);
        return new FesResponse().success();
    }

    *//**
     * post 开阀结果上报
     *
     * @return
     *//*
    @ApiOperation("开阀结果上报 ")
    @PostMapping(value = "openVResutl", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public FesResponse openVResutl(@RequestBody JSONObject jsonObject) {
        MeterInfoParam meterInfoParam = JSONObject.parseObject(String.valueOf(jsonObject), MeterInfoParam.class);
        meterDataUpService.openVResutl(meterInfoParam);
        return new FesResponse().success();
    }

    *//**
     * post 关阀结果上报
     *
     * @return
     *//*
    @ApiOperation("关阀结果上报")
    @PostMapping(value = "closeVResult", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public FesResponse closeVResult(@RequestBody JSONObject jsonObject) {
        MeterInfoParam meterInfoParam = JSONObject.parseObject(String.valueOf(jsonObject), MeterInfoParam.class);
        meterDataUpService.closeVResult(meterInfoParam);
        return new FesResponse().success();
    }


    *//**
     * post 调价变价结果上报
     *
     * @return
     *//*
    @ApiOperation("调价变价结果上报 ")
    @PostMapping(value = "chargePriceResutl", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public FesResponse chargePriceResutl(@RequestBody JSONObject jsonObject) {
        RechargeParam rechargeParam = JSONObject.parseObject(String.valueOf(jsonObject), RechargeParam.class);
        meterDataUpService.chargePriceResutl(rechargeParam);
        return new FesResponse().success();
    }*/

    /**
     * get 获取token
     *
     * @return
     */
    @ApiOperation("获取token")
    @GetMapping(value = "token/{serviceId}/{serviceSecret}")
    public FesResponse getToken(@PathVariable(value = "serviceId") String serviceId, @PathVariable(value = "serviceSecret") String serviceSecret) throws Exception {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("serviceId", serviceId);
        jsonObject.put("serviceSecret", serviceSecret);
        return commonService.getToken(jsonObject);
    }
}
