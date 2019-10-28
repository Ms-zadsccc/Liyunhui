package com.example.liyunhui.common.config.swagger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwaagerController {
    @RequestMapping("/swagger.do")
    public String SwaggerYi(){
        return "redirect:swagger-ui.html";
    }
}

