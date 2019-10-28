package com.example.liyunhui.dao;

import com.example.liyunhui.model.Login;
import org.springframework.stereotype.Component;

import java.util.List;

public interface LoginDao {
    List<Login> loginAll();

    Object insert( Login login );

    List<Login> search( String name );

    int deleLogin( int id );
}
