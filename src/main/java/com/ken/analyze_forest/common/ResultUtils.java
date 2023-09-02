package com.ken.analyze_forest.common;

/**
 * @author ken
 * @time 2023年9月1日
 */
public class ResultUtils {

    public static <T> BaseResponse<T> success(T Data){
        return new BaseResponse<T>(200,Data,"success");
    }

    public static BaseResponse error(ErrorCode errorCode)
    {
        return new BaseResponse(errorCode);
    }

    public static BaseResponse error(int Code,String Message)
    {
        return new BaseResponse(Code,null,Message);
    }

    public static BaseResponse error(ErrorCode errorCode,String Message)
    {
        return new BaseResponse(errorCode.getCode(),null,Message);
    }


}
