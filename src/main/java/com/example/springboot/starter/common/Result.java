package com.example.springboot.starter.common;

public class Result<T> {

    /**
     * 响应码
     */
    private Integer resCode;

    /**
     * 错误码
     */
    private String errCode;

    /**
     * 错误信息
     */
    private String errMsg;

    /**
     * 数据
     */
    private T data;

    public Result() {
    }

    public Result(Integer resCode, String errCode, String errMsg, T data) {
        this.resCode = resCode;
        this.errCode = errCode;
        this.errMsg = errMsg;
        this.data = data;
    }

    public Integer getResCode() {
        return resCode;
    }

    public void setResCode(Integer resCode) {
        this.resCode = resCode;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
