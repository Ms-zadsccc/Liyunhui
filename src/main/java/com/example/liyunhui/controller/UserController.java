package com.example.liyunhui.controller;

import com.example.liyunhui.baseOn.controller.BaseController;
import com.example.liyunhui.model.RequestMessage;
import com.example.liyunhui.model.User;
import com.example.liyunhui.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController extends BaseController {
    @Autowired
    UserService userService;
    RequestMessage requestMessage=new RequestMessage();
    @RequestMapping("/searchAll")
    @Override
    public Object searchAll()  {
        List<User>userList=userService.searchAll();
        PageHelper.startPage(1,2);
        PageInfo<User> userPageInfo=new PageInfo<>(userList);
        long total=userPageInfo.getTotal();
        System.out.println(total);
        System.out.println(userPageInfo);
//        throw  new Exception();
        return requestMessage.success(userPageInfo);
    }
    @PostMapping("/add")
    public Object insert( @RequestBody User user ) {
        userService.insert(user);
        return requestMessage.success(userService.insert(user));
    }
    @PutMapping("/edit")
    public Object edit( @RequestBody User user ) {
        return requestMessage.success(userService.edit(user));
    }
    @DeleteMapping("/delete/{id}")
    @Override
    public Object delete( @PathVariable int id ) {
        return requestMessage.success(userService.delete(id));
    }


}
