package com.qwgas.fes.vo.mapToStruct;

import com.qwgas.fes.vo.dcc.GatherInstanceDetail;
import com.qwgas.fes.vo.param.MeterDataUpParam;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MeterDataUpConvter {
  /*  @Mappings({
            @Mapping(source = "meterAddrNo", target = "meterNo", defaultValue = ""),
            @Mapping(source = "gasMeterId", target = "factoryCode", defaultValue = ""),
            @Mapping(source = "meterUserNo", target = "meterType", defaultValue = ""),
            @Mapping(source = "timerGas", target = "temperature", defaultValue = ""),
            @Mapping(source = "planNo", target = "valveStatus", defaultValue = ""),
            @Mapping(source = "checkRemark", target = "totalRechargeAmt")
    })
    MeterDataUpParam domain2dto(GatherInstanceDetail detail);

    List<MeterDataUpParam> domain2dto(List<GatherInstanceDetail> details);*/

}
