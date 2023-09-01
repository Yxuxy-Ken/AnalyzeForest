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
@AllArgsConstructor
public class BaseResponse<T> implements Serializable {

    private int Code;

    private T Data;

    private String Message;

    public BaseResponse(int Code, T Data){
        this(Code,Data,"");
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }

}