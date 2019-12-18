package com.qwgas.fes.vo.param;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @desc 补抄数据上报
 * @author ljh
 * @date 2019-12-06 08:57
 *
 */
@Data
public class MeterDataSupplementParam implements Serializable {

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
     * 表内时钟 yyyy-mm-dd HH24:MM:SS
     */
    private String meterTime;

    /**
     * 抄表明细数据
     */
    private List<MeterReadingDetails> readingDetails;

}
