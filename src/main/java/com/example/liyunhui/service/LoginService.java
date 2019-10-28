package com.example.liyunhui.service;


import com.example.liyunhui.model.Login;

import java.util.List;

public interface LoginService {
    List<Login> loginAll();

    int deleLogin( int id );

    List<Login> search( String name );

    Object insert( Login login );
}
