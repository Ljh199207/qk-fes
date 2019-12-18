package com.qwgas.fes.vo.param;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author ljh
 * @date 2019-12-06 09:03
 * @desc 充值结果上报
 */
@Data
public class RechargeUpParam implements Serializable {
    /**
     * 表具编号（表钢号）
     */
    @NotNull
    private String meterNo;
    /**
     * 表厂编号，为表厂分配的内部编号
     */
    @NotNull
    private String factoryCode;

    /**
     * 表具型号，为表厂分配的表具型号
     */
    @NotNull
    private String meterType;

    /**
     * 指令序列号
     */
    @NotNull
    private String commandSeq;

    /**
     * 交易流水号
     */
    @NotNull
    private String tradeNo;

    /**
     * 充值量
     */
    @NotNull
    private String rechargeNum;


    /**
     * 累计充值金额，金额表
     */
    private String totalRechargeAmt;

    /**
     * 累计充值气量，气量表
     */
    private String totalRechargeQty;

    /**
     * 表存剩余金额, 表端计费金额表需填写
     */
    private String meterBalanceAmt;

    /**
     * 表存剩余气量 表端计费气量表需填写
     */
    private String meterBalanceQty;

    /**
     * 充值结果 00，成功，01 失败
     */
    private String resultCode;
}
