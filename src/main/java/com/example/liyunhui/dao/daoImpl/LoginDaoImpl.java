package com.example.liyunhui.dao.daoImpl;

import com.example.liyunhui.dao.LoginDao;
import com.example.liyunhui.mapper.LoginMapper;
import com.example.liyunhui.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Transactional
@Component
public class LoginDaoImpl implements LoginDao {
    @Autowired
    LoginMapper loginMapper;      //创建mapper文件
    @Override
    public List<Login> loginAll() {
        return loginMapper.loginAll();
    }

    @Override
    public Object insert( Login login ) {
        return loginMapper.insert(login);
    }

    @Override
    public List<Login> search( String name ) {
        return loginMapper.search(name);
    }

    @Override
    public int deleLogin( int id ) {
        return loginMapper.deleLogin(id);
    }
}
