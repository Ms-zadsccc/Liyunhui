package com.example.liyunhui.common;

public enum HandlerNoSuccess {
    SUCCESS(500,"内部信息错误"),
    FAIL(501,"请求失败"),
    CUST(600,"请重新确认")
    ;
    private int code;
    private String message;

    HandlerNoSuccess( int code, String message ) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
