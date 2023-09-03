package com.ken.analyze_forest.common;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author ken
 * @time 2023年9月1日
 * @param <T>
 */
@Data
public class BaseResponse<T> implements Serializable {

    private int Code;

    private T Data;

    private String Message;

    public BaseResponse(int code, T data, String message) {
        Code = code;
        Data = data;
        Message = message;
    }

    public BaseResponse(int code, T data){
        Code = code;
        Data = data;
        Message = "";
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }

}