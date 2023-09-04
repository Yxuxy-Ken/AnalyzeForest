package com.ken.base.baseResponse;

import com.ken.base.emuns.Code;
import lombok.Data;
import lombok.NonNull;

import java.util.Objects;

@Data
public class Result<T> {

    private int code;

    private String msg;

    private T data;

    private String path;

    private long timestamp = System.currentTimeMillis();

    public Result(int code, String msg, T data, String path, long timestamp) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.path = path;
        this.timestamp = timestamp;
    }

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 常用成功返回
     * @param data
     * @return
     * @param <T>
     */
    public static <T> Result<T> success(@NonNull T data)
    {
        //这里二重验证其实不是很有必要
        Objects.requireNonNull(data);
        return new Result<>(Code.SUCCESS.getCode(), Code.SUCCESS.getMsg(), data);
    }

    /**
     * 常用失败返回
     * 这种定义是不是会和后面的自定义异常出现冲突
     * @param msg
     * @return
     * @param <T>
     */
    public static <T> Result<T> error(String msg)
    {
        return new Result<>(Code.ERROR.getCode(), msg,null,null,1123);
    }


}
