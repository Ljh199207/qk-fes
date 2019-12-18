package com.qwgas.fes.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.qwgas.fes.config.ApiParam;
import com.qwgas.fes.response.FesResponse;
import com.qwgas.fes.service.MeterDataService;
import com.qwgas.fes.util.FesResponseUtil;
import com.qwgas.fes.util.HttpClientUtil;
import com.qwgas.fes.util.ParserUtil;
import com.qwgas.fes.util.RestTemplateUtils;
import com.qwgas.fes.vo.MetreInfoVo;
import com.qwgas.fes.vo.dcc.GasPriceApiVO;
import com.qwgas.fes.vo.dcc.RechargeApiVO;
import com.qwgas.fes.vo.dcc.SearchMeter;
import com.qwgas.fes.vo.mapToStruct.MetreInfoVoConvter;
import com.qwgas.fes.vo.param.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Service
public class MeterDataServiceImpl implements MeterDataService {


    @Resource
    private final ApiParam apiParam;

    private final RestTemplate restTemplate;
    private final RestTemplateUtils restTemplateUtils;

    private final MetreInfoVoConvter metreInfoVoConvter;


    @Autowired
    public MeterDataServiceImpl(ApiParam apiParam, RestTemplate restTemplate, RestTemplateUtils restTemplateUtils, MetreInfoVoConvter metreInfoVoConvter) {
        this.apiParam = apiParam;
        this.restTemplate = restTemplate;
        this.restTemplateUtils = restTemplateUtils;
        this.metreInfoVoConvter = metreInfoVoConvter;
    }

    @Override
    public MetreInfoVo searchMetreInfo(QueryMeterParam queryMeterParam) {
        String url = apiParam.getDccUrl() + apiParam.getSearchMetreInfo();
        String url2 = ParserUtil.parse("{", "}", url, queryMeterParam.getMeterNo());
        ResponseEntity responseEntity = restTemplateUtils.get(url2);
        JSONObject optional = Optional.ofNullable(responseEntity)
                .flatMap(obj -> Optional.ofNullable(obj.getBody()))
                .flatMap(jsonObj -> Optional.ofNullable(JSON.parseObject(jsonObj.toString()).getJSONObject("data")))
                .get();
        SearchMeter searchMeter = JSONObject.parseObject(String.valueOf(optional), SearchMeter.class);
        System.out.println(searchMeter);
        if (searchMeter != null) {
            MetreInfoVo metreInfoVo = metreInfoVoConvter.domain2dto(searchMeter);
            metreInfoVo.setMeterNo(queryMeterParam.getMeterNo());
            return metreInfoVo;
        }
        return null;
    }

    /**
     * 开关阀
     *
     * @param valveOperateParam 1
     * @return FesResponse
     */
    @Override
    public FesResponse valveOpera(ValveOperateParam valveOperateParam) {
        String url = apiParam.getDccUrl() + apiParam.getValveOpera();
        String url2 = ParserUtil.parse("{", "}", url, valveOperateParam.getMeterNo());
        ValveOperate valveOperate = new ValveOperate();
        if (StringUtils.isNotBlank(valveOperateParam.getValveOperate())) {
            switch (valveOperateParam.getValveOperate()) {
                //开
                case "0":
                    valveOperate.setType("1");
                    break;
                // 关
                case "1":
                    valveOperate.setType("3");
                    break;
                //普关
                case "2":
                    valveOperate.setType("2");
            }
        }
        String s = HttpClientUtil.doPut(url2, restTemplateUtils.getToken(), JSON.toJSONString(valveOperate));
        System.out.println(s);
        JSONObject jsonObject = JSONObject.parseObject(s);
        ResultParam resultParam = new ResultParam();

        if (jsonObject.containsKey("code") && ("0").equals(jsonObject.getString("code"))) {
            resultParam.setResultCode("00");
        } else {
            resultParam.setResultCode("01");
        }
        String commandId = Optional.ofNullable(jsonObject).flatMap(jsonObject1 -> Optional.ofNullable(jsonObject1.getJSONObject("data")))
                .flatMap(jsonObject1 -> Optional.ofNullable(jsonObject1.getString("commandId"))).orElse("");
        resultParam.setCommandSeq(commandId);
        resultParam.setMeterNo(valveOperateParam.getMeterNo());
        resultParam.setMeterType(valveOperateParam.getMeterType());
        resultParam.setFactoryCode(valveOperateParam.getFactoryCode());
        // todo 开阀 返回操作
        if (("0").equals(valveOperateParam.getValveOperate())) {
            String ss = HttpClientUtil.doPost("http://localhost:8080/tes", restTemplateUtils.getToken(), JSON.toJSONString(resultParam));
        }
        // todo 关阀 返回操作
        else {
            String ss = HttpClientUtil.doPost("http://localhost:8080/tes", restTemplateUtils.getToken(), JSON.toJSONString(resultParam));
        }
        return FesResponseUtil.fesResponse(s);
    }

    /**
     * 充值
     *
     * @param rechargeParam 11
     * @return FesResponse
     */
    @Override
    public FesResponse recharge(RechargeParam rechargeParam) {
        String url = apiParam.getDccUrl() + apiParam.getRecharge();
        String url2 = ParserUtil.parse("{", "}", url, rechargeParam.getMeterNo());
        RechargeApiVO rechargeApiVO = new RechargeApiVO();
        if (StringUtils.isNotBlank(rechargeParam.getRechargeType()) && ("1").equals(rechargeParam.getRechargeType())) {
            rechargeApiVO.setRechargeType(2);
        } else if (StringUtils.isNotBlank(rechargeParam.getRechargeType()) && ("2").equals(rechargeParam.getRechargeType())) {
            rechargeApiVO.setRechargeType(1);
        }
        rechargeApiVO.setAmount(Double.valueOf(rechargeParam.getRechargeNum()));
        String s = HttpClientUtil.doPost(url2, restTemplateUtils.getToken(), JSON.toJSONString(rechargeApiVO));
        System.out.println(s);
        JSONObject jsonObject = JSONObject.parseObject(s);
        //todo 返回数据
        RechargeUpParam rechargeUpParam = new RechargeUpParam();
        String commandId = Optional.ofNullable(jsonObject).flatMap(jsonObject1 -> Optional.ofNullable(jsonObject1.getJSONObject("data")))
                .flatMap(jsonObject1 -> Optional.ofNullable(jsonObject1.getString("commandId"))).orElse("");
        rechargeUpParam.setCommandSeq(commandId);
        rechargeUpParam.setFactoryCode(rechargeParam.getFactoryCode());
        rechargeUpParam.setMeterNo(rechargeParam.getMeterNo());
        rechargeUpParam.setMeterType(rechargeParam.getMeterNo());
        String ss = HttpClientUtil.doPost("http://localhost:8080/tes", restTemplateUtils.getToken(), JSON.toJSONString(rechargeUpParam, SerializerFeature.WriteMapNullValue));
        System.out.println(ss);
        return FesResponseUtil.fesResponse(s);
    }

    @Override
    public FesResponse changePrice(ChangepriceParam changepriceParam) throws ParseException {
        String url = apiParam.getDccUrl() + apiParam.getChangePrice();
        String url2 = ParserUtil.parse("{", "}", url, changepriceParam.getMeterNo());
        GasPriceApiVO gasPriceApiVO = new GasPriceApiVO();
        if (StringUtils.isNotBlank(changepriceParam.getPriceLadderNum()) && ("1").equals(changepriceParam.getPriceLadderNum())) {
            gasPriceApiVO.setPriceTierCount(0);
        } else {
            gasPriceApiVO.setPriceTierCount(Integer.valueOf(changepriceParam.getPriceLadderNum()));
        }
        gasPriceApiVO.setTieredChargingCycle(Integer.valueOf(changepriceParam.getBillingCycl()));
        if (StringUtils.isNotBlank(changepriceParam.getCycleStartDat())) {
            SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
            Date date=sdf1.parse(changepriceParam.getCycleStartDat());
            SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String str=sdf2.format(date);
            gasPriceApiVO.setChargingBeginTime(str);
        } else if (StringUtils.isNotBlank(changepriceParam.getEffectiveDate())) {
            gasPriceApiVO.setChargingBeginTime(changepriceParam.getEffectiveDate());
        }
        gasPriceApiVO.setTierPrice1(Double.valueOf(changepriceParam.getPrice0()));
        gasPriceApiVO.setTierPrice2(Double.valueOf(changepriceParam.getPrice1()));
        gasPriceApiVO.setTierPrice3(Double.valueOf(changepriceParam.getPrice2()));
        gasPriceApiVO.setTierPrice4(Double.valueOf(changepriceParam.getPrice3()));
        gasPriceApiVO.setTierPrice5(Double.valueOf(changepriceParam.getPrice4()));
        if (StringUtils.isNotBlank(changepriceParam.getLevel1())) {
            gasPriceApiVO.setTierGas1(changepriceParam.getLevel1());
        }
        if (StringUtils.isNotBlank(changepriceParam.getLevel2())) {
            gasPriceApiVO.setTierGas2(changepriceParam.getLevel2());
        }
        if (StringUtils.isNotBlank(changepriceParam.getLevel3())) {
            gasPriceApiVO.setTierGas3(changepriceParam.getLevel3());
        }
        if (StringUtils.isNotBlank(changepriceParam.getLevel4())) {
            gasPriceApiVO.setTierGas4(changepriceParam.getLevel4());
        }
        String s = HttpClientUtil.doPut(url2, restTemplateUtils.getToken(), JSON.toJSONString(gasPriceApiVO));

        // todo  返回数据
        ResultParam resultParam = new ResultParam();
        resultParam.setMeterType(changepriceParam.getMeterType());
        resultParam.setMeterNo(changepriceParam.getMeterNo());
        resultParam.setFactoryCode("");
        String ss = HttpClientUtil.doPut("http://localhost:8080/tes", restTemplateUtils.getToken(), JSON.toJSONString(gasPriceApiVO));

        System.out.println(s);
        return FesResponseUtil.fesResponse(s);
    }

    @Override
    public FesResponse updatePriceAndBalan(UpdatePriceAndBalance updatePriceAndBalance) {
        String url = apiParam.getDccUrl() + apiParam.getUpdatePriceAndBalance();
        String url2 = ParserUtil.parse("{", "}", url, updatePriceAndBalance.getMeterNo());
        String s = HttpClientUtil.doPost(url2, restTemplateUtils.getToken(), JSON.toJSONString(updatePriceAndBalance));
        // todo  返回数据

        return null;
    }

    @Override
    public FesResponse cancelRecharge(CancelRechargeParam rechargeParam) {
        String url = apiParam.getDccUrl() + apiParam.getRecharge();
        String url2 = ParserUtil.parse("{", "}", url, rechargeParam.getMeterNo());
        RechargeApiVO rechargeApiVO = new RechargeApiVO();
        //冲正，取消充值
        rechargeApiVO.setMode(2);
        rechargeApiVO.setAmount(Double.valueOf(rechargeParam.getRechargeNum()));
        String s = HttpClientUtil.doPost(url2, restTemplateUtils.getToken(), JSON.toJSONString(rechargeApiVO));
        //todo 返回数据
        RechargeUpParam rechargeUpParam = new RechargeUpParam();
        JSONObject jsonObject = JSONObject.parseObject(s);
        //todo 返回数据
        String commandId = Optional.ofNullable(jsonObject).flatMap(jsonObject1 -> Optional.ofNullable(jsonObject1.getJSONObject("data")))
                .flatMap(jsonObject1 -> Optional.ofNullable(jsonObject1.getString("commandId"))).orElse("");
        rechargeUpParam.setCommandSeq(commandId);
        rechargeUpParam.setFactoryCode(rechargeParam.getFactoryCode());
        rechargeUpParam.setMeterNo(rechargeParam.getMeterNo());
        rechargeUpParam.setMeterType(rechargeParam.getMeterNo());
        String ss = HttpClientUtil.doPost("http://localhost:8080/tes", restTemplateUtils.getToken(), JSON.toJSONString(rechargeUpParam));
        return FesResponseUtil.fesResponse(s);
    }

    @Override
    public FesResponse meterInfo(MeterInfoParam metreInfoVo) {
        String url = apiParam.getDccUrl() + apiParam.getMeterInfo();
        String s = HttpClientUtil.doPost(url, restTemplateUtils.getToken(), JSON.toJSONString(metreInfoVo));
        return null;
    }

    @Override
    public FesResponse openAccount(OpenAccountParam openAccountParam) {
        return null;
    }

    @Override
    public FesResponse setParameter(ParameterUpParam parameterUpParam) {
        return null;
    }

    @Override
    public FesResponse getParameter(ParameterParam parameterParam) {
        return null;
    }

    @Override
    public FesResponse dataSupplement(DataSupplementParam dataSupplementParam) {
        return null;
    }
}
