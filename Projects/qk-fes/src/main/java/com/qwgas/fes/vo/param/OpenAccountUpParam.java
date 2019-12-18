package com.qwgas.fes.vo.param;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author ljh
 * @date 2019-12-06 09:41
 * 指令表具请求开通
 */
@Data
public class OpenAccountUpParam implements Serializable {
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
     * 表内时钟 yyyy-mm-dd HH24:MM:SS
     */
    @NotNull
    private String meterTime;
}
