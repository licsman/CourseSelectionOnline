package com.azure.graduate.response;

public enum AppResponseStatus {
    SUCCESS(1000, "success"),
    FAILED(1001, "failed"),
    VALIDATE_FAILED(1002, "Parameter verification failed"),
    ERROR(5000, "Unknown Errors");

    private final int code;
    private final String msg;
    AppResponseStatus(int code, String msg) {
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
