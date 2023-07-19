package com.ustc.errand.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Result<T> {
    /**
     * 响应码, example:0000
     */
    private String resultCode;

    /**
     * 响应描述
     */
    private String resultDesc;

    /**
     * 响应数据
     */
    private T resultData;

    private Result(String resultCode) {
        this.resultCode = resultCode;
        this.resultDesc = null;
        this.resultData = null;
    }

    public Result(String resultCode, String resultDesc, T resultData) {
        this.resultCode = resultCode;
        this.resultDesc = resultDesc;
        this.resultData = resultData;
    }


    public static <T> Result<T> successResult() {
        return new Result<T>(ResultType.SUCCESS.getCode());
    }

    public static <T> Result<T> successResult(T resultData) {
        return new Result<T>(ResultType.SUCCESS.getCode(), null, resultData);
    }

    public static <T> Result<T> fail() {
        return new Result<T>(ResultType.COMMON_FAIL.getCode());
    }

    public static <T> Result<T> fail(String resultCode, String resultDesc) {
        return new Result<T>(resultCode, resultDesc, null);
    }

}
