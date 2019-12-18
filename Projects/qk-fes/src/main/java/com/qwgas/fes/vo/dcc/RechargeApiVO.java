package com.qwgas.fes.vo.dcc;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class RechargeApiVO {

    @NotNull(message = "mode cant't be null")
    private Integer mode = 1;

    private Integer rechargeType = 2;

    @NotNull(message = "amount cant't be null")
    private Double amount = 1.0;

    private Integer payMethod = 1;
}
