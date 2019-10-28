package com.example.liyunhui.common.config.Myexception;

import com.example.liyunhui.common.HandlerNoSuccess;
import com.example.liyunhui.common.Myexception;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class RestExceptionHandler {
    /**
     *
     */
    @ExceptionHandler(Exception.class)     //对所有的方法进行一个请求的增强
    @ResponseBody
    public Myexception defaultExceptionhandler( Exception e){
        if (e instanceof Exception){
            Exception e1=e;
           return  new Myexception(HandlerNoSuccess.SUCCESS);
        }else {
            Exception el=e;
            return new Myexception("未知异常，需要自己检测");
        }
    }
}
