package com.qwgas.fes.vo.param;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author ljh
 * @date 2019-12-06 09:14
 */
@Data
public class ParameterUpParam implements Serializable {
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
    private String commandSeq ;

    /**
     * ip
     */
    private String ip ;

    /**
     * port
     */
    private String port ;

    /**
     * 上报周期，0、天，1、月
     */
    private String upCycle  ;

    /**
     * 如果配置为按天传，则该字段表示几天,
     * 例如 2 天一次，3 天一次
     * 如果配置为按月传，则该字段
     */
    private String upDay ;

    /**
     * 不用气天数
     */
    private String noUseDay ;

    /**
     * 余额不足一级告警量
     */
    private String alarmOne ;

    /**
     * 余额不足二级告警量
     */
    private String alarmTwo ;
    /**
     * 透支量
     */
    private String overdraft  ;
}
