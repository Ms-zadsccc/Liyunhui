package com.example.liyunhui.model;

import lombok.Data;

@Data
public class RequestMessage {
    private int code;
    private String message;
    private Object contet;
    @Deprecated
    public RequestMessage success(Object contet)  {
        RequestMessage requestMessage=new RequestMessage();
        requestMessage.setCode(200);
        requestMessage.setMessage("success");
        requestMessage.setContet(contet);
        return requestMessage;
    }
}
