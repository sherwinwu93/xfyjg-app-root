package com.xfjyg.sapiservice.exception.runtimeexception;

public class AppRuntimeException extends RuntimeException {
    private static final long serialVersionUID = -2613876069693371396L;
    private String code;
    private String msg;
    private int httpStatus;

    public AppRuntimeException(int httpStatus, String code, String msg) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public int getHttpStatus() {
        return httpStatus;
    }
}
