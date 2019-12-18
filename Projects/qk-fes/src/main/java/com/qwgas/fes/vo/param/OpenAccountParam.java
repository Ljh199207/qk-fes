package com.qwgas.fes.vo.param;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author ljh
 * @date 2019-12-06 11:09
 */
@Data
public class OpenAccountParam implements Serializable {

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
     * 开通状态 1：成功 2 失败
     */
    @NotNull
    private String status ;

    /**
     * 运行模式 1:表端计费 2 中心计费
     */
    private String runModel ;


    /**
     * 阀门状态 0：强制开；1:强制关；2:退出
     * 强制 默认 2
     */
    private String valveStatus;

    /**
     * 冻结时间：格式 24HHMMSS
     */
    private String frozenTime;

    /**
     * 抄表类型 ：0x00 每天
     */
    private String readingType ;

    /**
     * 周期 1 单位小时
     */
    private String cycleDate;

    /**
     * 抄表时间：24HHMMSS
     */
    private String readingTime ;
    /**
     * 价格名称
     */
    @NotNull
    private String priceNam;

    /**
     * 价格版本
     */
    private String priceVersion;

    /**
     * 阶梯级数，单一价=1
     */
    private String priceLadderNum;

    /**
     * 阶梯价计费周期
     */
    private String billingCycl;

    /**
     * 调价日期（生效日期）yyyy-mm-dd
     */
    @NotNull
    private String effectiveDate;

    /**
     * 周期开始日期 yyyy-mm-dd
     * HH24:MM:SS
     */
    private String cycleStartDat;

    /**
     * 单价0
     */
    @NotNull
    private String price0 ;

    /**
     * 单价1
     */
    private String price1;

    /**
     * 单价2
     */
    private String price2;

    /**
     * 单价3
     */
    private String price3;

    /**
     * 单价4
     */
    private String price4;

    /**
     * 阶梯气量 0
     */
    private String level1 ;
    /**
     * 阶梯气量 1
     */
    private String level2 ;
    /**
     * 阶梯气量 2
     */
    private String level3 ;
    /**
     * 阶梯气量 3
     */
    private String level4 ;
    /**
     * 调价次数
     */
    private String priceNum;
}
