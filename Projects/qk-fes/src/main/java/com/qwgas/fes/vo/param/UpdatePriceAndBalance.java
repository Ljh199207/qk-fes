package com.qwgas.fes.vo.param;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author ljh
 * @date 2019-12-06 10:38
 */
@Data
public class UpdatePriceAndBalance implements Serializable {
    /**
     * 表具编号（表钢号）
     */
    @NotNull
    private String meterNo;

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
     * 单价
     */
    private String price;

    /**
     * 余额
     */
    private String balanceAmt;
    /**
     * 累计使用金额
     */
    private String totalUseAmt;

}
