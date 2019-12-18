package com.qwgas.fes.vo.param;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author ljh
 * @date 2019-12-06 09:36
 */
@Data
public class ResultParam implements Serializable {
    /**
     * 表具编号（表钢号）
     */
    @NotNull
    private String meterNo;
    /**
     * 表厂编号，为表厂分配的内部编号
     */
    private String factoryCode;

    /**
     * 表具型号，为表厂分配的表具型号
     */
    @NotNull
    @JsonSerialize
    private String meterType;

    /**
     * 指令序列号
     */
    @NotNull
    private String commandSeq ;

    /**
     * 指令执行结果
     */
    @NotNull
    private String resultCode ;
}
