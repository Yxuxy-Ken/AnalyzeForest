package com.ken.base.emuns;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Code {

    /**
     * 成功
     */
    SUCCESS(200, "成功"),
    /**
     * 错误的请求
     */
    BAD_REQUEST(400, "错误的请求"),
    /**
     * 找不到对应请求
     */
    NOT_FOUND(404, "找不到对应请求"),
    /**
     * 不支持的请求方法
     */
    METHOD_NOT_ALLOWED(405, "不支持的请求方法"),
    /**
     * 内部错误
     */
    ERROR(500, "内部错误"),

    /**
     * 未定义异常
     */
    UNKNOWN_ERROR(515,"UNKNOWN")
    ;

    private final int code;

    private final String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
