package com.qwgas.fes.vo.param;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author ljh
 * @date 2019-12-06 08:46
 * @desc 抄表明细
 */
@Data
public class MeterReadingDetails implements Serializable {

    /**
     * 数据冻结时间 yyyy-mm-dd HH24:MM:SS
     */
    @NotNull
    private String dataTime;
    /**
     * 表读数（累计使用气量）
     */
    @NotNull
    private String readingNum;

    /**
     * 标况总量(流量计)
     */
    private String standardNum;

    /**
     * 工况总量(流量计)
     */
    private String workNum;
    /**
     * 表存剩余金额 表端计费金额表需填写
     */
    private String meterBalanceAmt;

    /**
     * 累计使用金额 表端计费金额表需填写
     */
    private String totalUseAmt;
    /**
     * 表存剩余气量 表端计费气量表需填写
     */
    private String meterBalanceQty;
    /**
     * 单价
     */
    private String price;
    /**
     * 阶梯累用额(秦川必传)
     */
    private String ladderQty;

}
