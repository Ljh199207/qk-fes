package com.qwgas.fes.response;

import com.qwgas.fes.vo.codeEnum.ReturnCode;

import java.util.HashMap;

/**
 * @author MrBird
 */
public class FesResponse extends HashMap<String, Object> {

    private static final long serialVersionUID = -8713837118340960775L;

    public FesResponse code(ReturnCode returnCode) {
        this.put("returnCode", returnCode.getCode());
        return this;
    }

    public FesResponse message(String message) {
        this.put("returnMessage", message);
        return this;
    }

    public FesResponse data(Object data) {
        this.put("returnParam", data);
        return this;
    }

    public FesResponse success() {
        this.code(ReturnCode.SUCCESS);
        return this;
    }

    public FesResponse fail() {
        this.code(ReturnCode.UNKNOW_ERROR);
        return this;
    }

    @Override
    public FesResponse put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
