package com.example.liyunhui.baseOn.service;

import java.util.List;

public  interface BaseService<E> {
     int insert( E e );

     int edit( E e );

     E search( String name ) ;

     int update( E e );

     List<E> searchAll();
     int delete( int id );

}
