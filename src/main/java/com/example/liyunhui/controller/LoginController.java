package com.example.liyunhui.controller;

import com.example.liyunhui.baseOn.controller.BaseController;
import com.example.liyunhui.model.Login;
import com.example.liyunhui.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("login")
public class LoginController extends BaseController {
    @Autowired
    LoginService loginService;
    @RequestMapping("/")
    public String dsa(){
        return "index";
    }
    @RequestMapping("/loginAll")
    public String  loginAll( HttpServletRequest  request){
        List<Login> loginList=loginService.loginAll();
        request.setAttribute("loginList",loginList);
        return "login";
    }
    @GetMapping("/search/{name}")
    public List<Login> search( String name ) {
        List<Login> loginList=loginService.search(name);
        return loginList;
    }
    @DeleteMapping("/delete/{id}")
    @Override
    public Object delete( int id ) {
        int a=loginService.deleLogin(id);
        return a;
    }
    @PutMapping("/insert")
    public Object insert( Login login ) {
        return loginService.insert(login);
    }
    @PutMapping("")
    @Override
    public Object edit( Object o ) {
        return super.edit(o);
    }
}
