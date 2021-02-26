package com.azure.graduate.response;

public class AppResponseBody<T> {
    private final int code;
    private final String message;
    private final T data;

    public AppResponseBody(T data){
        this(AppResponseStatus.SUCCESS, data);
    }

    public AppResponseBody(AppResponseStatus resultCode, T data) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMsg();
        this.data = data;
    }

    public AppResponseBody(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
