package com.qwgas.fes.vo.param;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author ljh
 * @date 2019-12-06 10:33
 */
@Data
public class RechargeParam  implements Serializable {
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
     * 充值类型，1、金额，2、气量
     */
    @NotNull
    private String rechargeType;

    /**
     * 充值次数
     */
    @NotNull
    private String rechargeCount;

    /**
     * 交易流水号
     */
    @NotNull
    private String tradeNo ;

    /**
     * 充值时间，YYYY-MM-DD HH24:MI:SS
     */
    @NotNull
    private String rechargeTime;

    /**
     * 充值量
     */
    @NotNull
    private String rechargeNum;

    /**
     * 累计充值金额
     */
    @NotNull
    private String totalRechargeAmt;

    /**
     * 表账户余额
     */
    private String meterBalanceAmt ;


}
