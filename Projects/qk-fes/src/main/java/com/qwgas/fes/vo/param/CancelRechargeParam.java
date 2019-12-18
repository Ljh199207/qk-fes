package com.qwgas.fes.vo.param;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author ljh
 * @date 2019-12-06 10:38
 */
@Data
public class CancelRechargeParam implements Serializable {
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
}
