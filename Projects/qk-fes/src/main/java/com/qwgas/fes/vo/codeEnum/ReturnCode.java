package com.qwgas.fes.vo.codeEnum;

/**
 * @author ljh
 * @date 2019-12-06 11:24
 */
public enum ReturnCode {
    //交易成功
    SUCCESS("0000","交易成功"),
    //表厂编号不存在
    FACTORYCODE_NOT_EXIST("1001","表厂编号不存在"),
    //表具型号不存在
    METERTYPE_NOT_EXIST("1002","表具型号不存在"),
    //表具编号不存在
    METERNO_NOT_EXIST("1003","表具编号不存在"),
    //阶梯级数不能为空
    PRICElADDERNUM_NOT_EMPTY("1101","阶梯级数不能为空"),
    UNKNOW_ERROR("9999","未知错误"),
    ;
    private String code;
    private String message;
    ReturnCode(String code,String message){
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
