package com.example.liyunhui.service.impl;

import com.example.liyunhui.mapper.UserMapper;
import com.example.liyunhui.model.User;
import com.example.liyunhui.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public  class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    private static  List<User>userList=new ArrayList<>();
    static {
        User user=new User();
        user.setId(1);
        user.setName("李云辉");
        user.setAge("23");
        user.setGender(0);
        userList.add(0,user);
    }
    @Override
    public int insert( Object o ) {
        User user= (User) o;
        userList.add(userList.size(),user);
        return 1;
    }

    @Override
    public int edit( Object o ) {
        User user= (User) o;
        userList.set(userList.size()-1,user);
//        userList.set(userList.size(),user);
        return 1;
    }

    @Override
    public Object search( String name ) {
        Object o;
        for (int i=0;i<userList.size();i++){
            if (userList.get(i).getName().equals(name)){
                o=userList.get(i);
                return  o;
            }
        }
        return null;
    }

    @Override
    public int update( Object o ) {
        return 0;
    }

    public List<User> searchAll() {
//        User user=new User();
//        user.setId(userList.size());
//        user.setName("李云辉");
//        user.setAge("23");
//        user.setGender(0);
//        userList.add(1,user);
        List<User>userList=userMapper.searchAll();
        return userList;
    }

    @Override
    public int delete( int id ) {
        if (userList.size()>id){
            userList.remove(id-1);
            return 1;
        }else {
            return 0;
        }
    }
}
