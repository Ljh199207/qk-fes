package com.qwgas.fes.vo.param;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author ljh
 * @date 2019-12-06 09:00
 * @desc 报警信息上报
 */
@Data
public class SendAlarmParam implements Serializable {

    /**
     * 表具编号（表钢号）
     */
    private String meterNo;
    /**
     * 表厂编号，为表厂分配的内部编号
     */
    private String factoryCode;

    /**
     * 表具型号，为表厂分配的表具型号
     */
    private String meterType;
    /**
     * 报警信息对象的集合
     */
    private List<AlarmInfo> alarms;
}
