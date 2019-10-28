package com.example.liyunhui.service.impl;

import com.example.liyunhui.dao.LoginDao;
import com.example.liyunhui.model.Login;
import com.example.liyunhui.model.RequestMessage;
import com.example.liyunhui.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class LoginServerImpl implements LoginService {
    RequestMessage requestMessage=new RequestMessage();
    @Autowired
    LoginDao loginDao;
    @Override
    @Cacheable(cacheNames = "userList")      //指定缓存
    public List<Login> loginAll() {
        return loginDao.loginAll();      //查询所有的数据
    }
    /**
     * @CacheEvict:清除缓存
     *    1.key:指定要清除缓存中的某条数据
     *    2.allEntries=true:删除缓存中的所有数据
     *    beforeInvocation=false:默认是在方法之后执行清除缓存
     *    3.beforeInvocation=true:现在是在方法执行之前执行清除缓存，
     *                          作用是：只清除缓存、不删除数据库数据
     */

    @Override
    @CacheEvict(cacheNames = "userList",key = "#id")     //删除数据后，同时消除缓存
    public int deleLogin( int id ) {
        return loginDao.deleLogin(id);
    }
    /**
     *   @Caching是 @Cacheable、@CachePut、@CacheEvict注解的组合
     *   以下注解的含义：
     *   1.当使用指定名字查询数据库后，数据保存到缓存
     *   2.现在使用id、age就会直接查询缓存，而不是查询数据库
     */
    @Caching(
            cacheable = {@Cacheable(cacheNames = "userList",key="#name")},
            put={ @CachePut(cacheNames = "userList",key = "#user.id"),
                    @CachePut(cacheNames = "userList",key = "#user.age")
            }
    )
    public List<Login> search( String name ) {
        return loginDao.search(name);
    }
    /**
     *   @Caching是 @Cacheable、@CachePut、@CacheEvict注解的组合
     *   以下注解的含义：
     *   1.当使用指定名字查询数据库后，数据保存到缓存
     *   2.现在使用id、age就会直接查询缓存，而不是查询数据库
     */

    @CachePut(key = "#login.id")      //删除数据的同时，同时删除缓存
    @Override
    public Object insert( Login login ) {
        return loginDao.insert(login);
    }
}
