package com.qwgas.fes.vo.param;

import lombok.Data;

import java.io.Serializable;

@Data
public class ValveOperate implements Serializable {

    private String type;

    private String callbackUrl;
}
