package com.xfjyg.sapiservice.exception;

public enum ExceptionDef {

    //I开头的做提示用
    USER_AUTH_ERR(500, "I1001", "用户验证错误"),
    USER_PRIVILEGE_ERR(500, "I1002", "用户无权限"),
    USER_AUTH_CODE_ERR(500, "I1003", "验证码错误"),
    USER_EXISTS(500, "I1004", "用户已存在"),

    CODE_MSG_PUSH_ERR(500, "I2001", "消息推送错误"),
    CODE_TIPS(500, "I2002", "信息提示"),

    CODE_ILLEGAL_CONTENT(500, "I9001", "内容非法"),
    CODE_OPERATION_NOT_ALLOWED(500, "I9002", "操作不允许"),
    CODE_DUPLICATE_CONTENT(500, "I9003", "内容重复"),

    //ER开头的为异常
    CODE_SYS_ERR(500, "ER000", "系统异常"),
    CODE_NOT_FOUND(500, "ER404", "内容没有找到"),
    CODE_SERVER_ERROR(500, "ER500", "服务器内部错误"),
    ;
    public static final String INFORMATION_PREFIX = "I";
    public static final String EXCEPTION_PREFIX = "ER";
    String code;
    String defaultMessage;
    int httpStatus;

    ExceptionDef(int httpStatus, String code, String defaultMessage) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.defaultMessage = defaultMessage;
    }

    public int httpStatus() {
        return httpStatus;
    }

    public String code() {
        return code;
    }

    public String defaultMessage() {
        return defaultMessage;
    }
}