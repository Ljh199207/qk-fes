package com.qwgas.fes.vo.dcc;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = false)
@Data
@ApiModel(value = "AlarmRecord", description = "报警上报信息")
public class AlarmRecord {
    private static final long serialVersionUID = 1L;
    /**
     * 报警信息id
     */
    @ApiModelProperty(value = "报警信息id", name = "id", position = 1, hidden = true, example = "0")
    private Integer id;
    /**
     * 上行帧报文id
     */
    @ApiModelProperty(value = "上行帧报文id", name = "upFrameRawId", position = 2, example = "0")
    private Integer upFrameRawId;
    /**
     * 下行帧报文id
     */
    @ApiModelProperty(value = "下行帧报文id", name = "downFrameRawId", position = 3, example = "0")
    private Integer downFrameRawId;
    /**
     * 表具编号
     */
    @ApiModelProperty(value = "表具编号", name = "meterAddrNo", position = 4, example = "")
    private String meterAddrNo;
    /**
     * SIM卡号(ICCID)
     */
    @ApiModelProperty(value = "SIM卡号(ICCID)", name = "iccid", position = 5, example = "")
    private String iccid;
    /**
     * 报警时间
     */
    @ApiModelProperty(value = "报警时间", name = "alertTime", position = 6, example = "2018-01-01 10:22:22")
    private LocalDateTime alertTime;
    /**
     * 报警器状态
     */
    @ApiModelProperty(value = "报警器状态", name = "alarmStatus", position = 7, example = "0")
    private Integer alarmStatus;
    /**
     * 报警类型
     */
    @ApiModelProperty(value = "报警类型", name = "alarmType", position = 8, example = "0")
    private Integer alarmType;
    /**
     * 前介质声速(报警/解除报警时)
     */
    @ApiModelProperty(value = "前介质声速(报警/解除报警时)", name = "frontMediumSoundVelocity", position = 9, example = "0")
    private Double frontMediumSoundVelocity;
    /**
     * 泄漏燃气浓度(报警/解除报警时)
     */
    @ApiModelProperty(value = "泄漏燃气浓度(报警/解除报警时)", name = "leakageGasConcentration", position = 10, example = "0")
    private Double leakageGasConcentration;
    /**
     * 标况总量(报警/解除报警时)
     */
    @ApiModelProperty(value = "标况总量(报警/解除报警时)", name = "standardModeAmount", position = 11, example = "0")
    private Double standardModeAmount;
    /**
     * 工况总量(报警/解除报警时)
     */
    @ApiModelProperty(value = "工况总量(报警/解除报警时)", name = "workingModeAmount", position = 12, example = "0")
    private Double workingModeAmount;
    /**
     * 瞬时标况流量(报警/解除报警时)
     */
    @ApiModelProperty(value = "瞬时标况流量(报警/解除报警时)", name = "standardModeInstFlow", position = 13, example = "0")
    private Double standardModeInstFlow;
    /**
     * 瞬时工况流量(报警/解除报警时)
     */
    @ApiModelProperty(value = "瞬时工况流量(报警/解除报警时)", name = "workingModeInstFlow", position = 14, example = "0")
    private Double workingModeInstFlow;
    /**
     * 瞬时压力(报警/解除报警时)
     */
    @ApiModelProperty(value = "瞬时压力(报警/解除报警时)", name = "pressure", position = 15, example = "0")
    private Double pressure;
    /**
     * 瞬时温度(报警/解除报警时)
     */
    @ApiModelProperty(value = "瞬时温度(报警/解除报警时)", name = "temperature", position = 16, example = "0")
    private Double temperature;
    /**
     * 阀门状态(报警/解除报警时)
     */
    @ApiModelProperty(value = "阀门状态(报警/解除报警时)", name = "valveStatus", position = 17, example = "0")
    private Integer valveStatus;
    /**
     * 关阀原因
     */
    @ApiModelProperty(value = "关阀原因", name = "closeValveCause", position = 18, example = "0")
    private Integer closeValveCause;
    /**
     * 最新余额(报警/解除报警时)
     */
    @ApiModelProperty(value = "最新余额(报警/解除报警时)", name = "lastBalance", position = 19, example = "0")
    private Double lastBalance;
    /**
     * 电池1电量(报警/解除报警时)
     */
    @ApiModelProperty(value = "电池1电量(报警/解除报警时)", name = "battery1Level", position = 20, example = "0")
    private Double battery1Level;
    /**
     * 电池2电量(报警/解除报警时)
     */
    @ApiModelProperty(value = "电池2电量(报警/解除报警时)", name = "battery2Level", position = 21, example = "0")
    private Double battery2Level;
    /**
     * 表具计量类型
     */
    @ApiModelProperty(value = "表具计量类型", name = "gasMeteringType", position = 22, example = "0")
    private Integer gasMeteringType;
    /**
     * 表具用途分类
     */
    @ApiModelProperty(value = "表具用途分类", name = "meterUseCategory", position = 23, example = "0")
    private Integer meterUseCategory;
    /**
     * 设备端返回状态码
     */
    @ApiModelProperty(value = "设备端返回状态码", name = "deviceStatusCode", position = 24, example = "")
    private String deviceStatusCode;
    /**
     * 设备端返回状态文本
     */
    @ApiModelProperty(value = "设备端返回状态文本", name = "deviceStatusText", position = 25, example = "")
    private String deviceStatusText;
    /**
     * 服务器端返回状态码
     */
    @ApiModelProperty(value = "服务器端返回状态码", name = "serverStatusCode", position = 26, example = "")
    private String serverStatusCode;
    /**
     * 服务器端返回状态文本
     */
    @ApiModelProperty(value = "服务器端返回状态文本", name = "serverStatusText", position = 27, example = "")
    private String serverStatusText;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "createTime", position = 28, example = "2018-01-01 10:22:22")
    private LocalDateTime createTime;
    /**
     * 租户id
     */
    @ApiModelProperty(value = "租户id", name = "tenantId", position = 29, hidden = true, example = "0")
    private Integer tenantId;

}
