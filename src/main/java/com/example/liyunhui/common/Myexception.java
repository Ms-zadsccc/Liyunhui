package com.example.liyunhui.common;

public class Myexception extends RuntimeException {
       private  int code;
       private  String message;

       /**
     * 部分请求失败的时候
     * @param handlerNoSuccess
     */
    public Myexception( HandlerNoSuccess handlerNoSuccess ) {
        this.code = handlerNoSuccess.getCode();
        this.message=handlerNoSuccess.getMessage();
    }

    /**
     * 这个在未知错误的时候，需要调用封装类
     * @param message
     */
    public Myexception(String message){
        this.message=message;
    }
    /**
     * 所有的请求全部失败的时候
     * @param message
     */

    public int getCode() {
        return code;
    }

}
