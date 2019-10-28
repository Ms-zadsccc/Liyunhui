package com.example.liyunhui.mapper;

import com.example.liyunhui.model.User;
import org.springframework.stereotype.Component;

import java.util.List;


public interface UserMapper {

    List<User> searchAll();
}
