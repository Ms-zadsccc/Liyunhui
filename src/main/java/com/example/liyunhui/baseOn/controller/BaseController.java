package com.example.liyunhui.baseOn.controller;


import com.example.liyunhui.baseOn.service.BaseService;
import com.example.liyunhui.model.RequestMessage;

import java.util.List;

public class BaseController<E> {
    RequestMessage requestMessage=new RequestMessage();
    BaseService baseService;
    public Object searchAll() throws Throwable {
        return requestMessage.success(baseService.searchAll());
    }
    public Object search(String name){
        return  requestMessage.success(baseService.search(name));
    }
    public Object delete(int id){
        return requestMessage.success(baseService.delete(id));
    }
    public  Object insert(E e){
        return requestMessage.success(baseService.insert(e));
    }
    public Object edit(E e){
        return requestMessage.success(baseService.edit(e));
    }

}
