package com.azure.graduate.exception;

public class AppExceptionBody extends RuntimeException{
    private final int code;
    private final String msg;

    public AppExceptionBody() {
        this(1001, "接口错误");
    }

    public AppExceptionBody(String msg) {
        this(1001, msg);
    }

    public AppExceptionBody(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}