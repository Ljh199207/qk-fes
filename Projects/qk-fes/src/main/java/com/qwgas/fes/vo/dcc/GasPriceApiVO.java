package com.qwgas.fes.vo.dcc;

import lombok.Data;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class GasPriceApiVO {

    @Min(value = 1, message = "no this chargingMode")
    @Max(value = 2, message = "no this chargingMode")
    private Integer chargingMode = 2;

    @Min(value = 1, message = "no this payMode")
    @Max(value = 2, message = "no this payMode")
    private Integer payMode = 1;

    private Integer priceTierCount = 1;

    private Integer tieredChargingCycle = 1;

    private String chargingBeginTime;

    @NotNull(message = "tierPrice1 can't be null")
    @DecimalMin(value = "0", message = "tierPrice1 must be greater than or equal to 0")
    private Double tierPrice1;

    @DecimalMin(value = "0", message = "tierPrice2 must be greater than or equal to 0")
    private Double tierPrice2 = 0.000;

    @DecimalMin(value = "0", message = "tierPrice3 must be greater than or equal to 0")
    private Double tierPrice3 = 0.000;

    @DecimalMin(value = "0", message = "tierPrice4 must be greater than or equal to 0")
    private Double tierPrice4 = 0.000;

    @DecimalMin(value = "0", message = "tierPrice5 must be greater than or equal to 0")
    private Double tierPrice5 = 0.000;

    @DecimalMin(value = "0", message = "tierPrice6 must be greater than or equal to 0")
    private Double tierPrice6 = 0.000;

    private String tierGas1;

    private String tierGas2;

    private String tierGas3;

    private String tierGas4;

    private String tierGas5;
}
