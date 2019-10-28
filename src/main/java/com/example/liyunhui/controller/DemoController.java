package com.example.liyunhui.controller;

import com.example.liyunhui.baseOn.controller.BaseController;
import com.example.liyunhui.model.RequestMessage;
import com.example.liyunhui.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class DemoController extends BaseController {
    RequestMessage requestMessage= new RequestMessage();
    @RequestMapping("/cust")
    public Object cust(@RequestBody @Valid User user ){
        return requestMessage.success(user);
    }

}
