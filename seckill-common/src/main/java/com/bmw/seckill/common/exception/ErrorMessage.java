package com.bmw.seckill.common.exception;

/**
 *
 */
public enum ErrorMessage {

    /**
     * 通用ERROR
     */
    SYS_ERROR(10000, "系统开小差了,稍后再试"),
    PARAM_ERROR(10001, "参数错误"),


    /**
     * user相关error.
     */
    SMSCODE_ERROR(30001, "短信验证码错误"),
    PHONE_EXIST(30002, "手机号已经存在"),
    USER_NEED_LOGIN(30003, "用户需要登录"),
    ;


    private Integer code;
    private String message;

    ErrorMessage(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public ErrorMessage setMessage(String message) {
        this.message = message;
        return this;
    }
}
