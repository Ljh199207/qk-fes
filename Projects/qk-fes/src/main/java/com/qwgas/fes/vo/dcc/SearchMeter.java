package com.qwgas.fes.vo.dcc;

import lombok.Data;

import java.io.Serializable;

@Data
public class SearchMeter implements Serializable {


    private String standardModeAmount;
    private String meterUserNo;
    private String meterAddrNo;
    private String installAddress;
    private String installDate;

}
