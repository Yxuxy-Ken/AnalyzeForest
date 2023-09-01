package com.ken.analyze_forest.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ken
 * @time 2023年9月1日
 */
public enum ErrorCode {

    SUCCESS(200,"SUCCESS"),
    PARAMS_ERROR(40001, "参数错误");



    private final int Code;
    private final String Message;

    ErrorCode(int Code, String Message)
    {
        this.Code = Code;
        this.Message = Message;
    }

    public int getCode(){
        return Code;
    }

    public String getMessage(){
        return Message;
    }


}
