package com.qwgas.fes.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author ljh
 * @date 2019-12-06 09:37
 * 查询表具信息
 */
@Data
public class MetreInfoVo implements Serializable {
    /**
     * 表具号
     */
    private String meterNo;

    /**
     * 用户号
     */
    private String userNo;
    /**
     * 地址(内容包含 街道、小区、楼栋、门牌
     * 号)
     */
    private String addrDes;
    /**
     * 安装时间 yyyy-mm-dd HH24:MM:SS
     */
    private String setUpTime ;

    /**
     * 表底数
     */
    private String enableMeterReading;
}
