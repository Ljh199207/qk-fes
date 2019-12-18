package com.qwgas.fes.vo.param;

import lombok.Data;

import java.io.Serializable;

@Data
public class QueryMeterParam implements Serializable {

    private String meterNo;

    private String meterType;
}
