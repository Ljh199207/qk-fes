package com.qwgas.fes.vo.dcc;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = false)
@Data
@ApiModel(value = "GatherInstanceDetail", description = "抄表记录")
public class GatherInstanceDetail {

    /**
     * 表具编号
     */
    @ApiModelProperty(value = "表具编号", name = "meterAddrNo", position = 9, example = "表具编号")
    private String meterAddrNo;
    /**
     * 抄表时间
     */
    @ApiModelProperty(value = "抄表时间", name = "gatherTime", position = 11, example = "2018-01-01 10:22:22")
    private LocalDateTime gatherTime;
    /**
     * 上次抄表时间
     */
    @ApiModelProperty(value = "上次抄表时间", name = "prevGatherTime", position = 12, example = "2018-01-01 10:22:22")
    private LocalDateTime prevGatherTime;

    /**
     * 本次表底
     */
    @ApiModelProperty(value = "本次表底", name = "gasReading", position = 14, example = "0")
    private Double gasReading;
    /**
     * 实用气量
     */
    @ApiModelProperty(value = "实用气量", name = "actualGasAmount", position = 15, example = "0")
    private Double actualGasAmount;
    /**
     * 调节气量
     */
    @ApiModelProperty(value = "调节气量", name = "adjustGasAmount", position = 16, example = "0")
    private Double adjustGasAmount;
    /**
     * 结算气量
     */
    @ApiModelProperty(value = "结算气量", name = "settleGasAmount", position = 17, example = "0")
    private Double settleGasAmount;
    /**
     * 单价
     */
    @ApiModelProperty(value = "单价", name = "price", position = 18, example = "0")
    private Double price;
    /**
     * 阶梯
     */
    @ApiModelProperty(value = "阶梯", name = "timerGas", position = 19, example = "阶梯")
    private String timerGas;
    /**
     * 气费金额
     */
    @ApiModelProperty(value = "气费金额", name = "amount", position = 20, example = "0")
    private Double amount;
    /**
     * 抄表方式
     */
    @ApiModelProperty(value = "抄表方式", name = "gatherType", position = 21, example = "0")
    private Integer gatherType;
    /**
     * 状态
     */
    @ApiModelProperty(value = "状态", name = "status", position = 25, example = "0")
    private Integer status;
    /**
     * 租户id
     */
    @ApiModelProperty(value = "租户id", name = "tenantId", position = 31, hidden = true, example = "0")
    private Integer tenantId;
    /**
     * 最大阶梯起始读数
     */
    @ApiModelProperty(value = "最大阶梯起始读数", name = "maxTierStartReading", position = 32, example = "0")
    private Double maxTierStartReading;
    /**
     * 最新余额
     */
    @ApiModelProperty(value = "最新余额", name = "lastBalance", position = 33, example = "0")
    private Double lastBalance;
    /**
     * 阶梯费用明细
     */
    @ApiModelProperty(value = "阶梯费用明细", name = "tierDetail", position = 1010, example = "阶梯费用明细")
    private String tierDetail;
}
