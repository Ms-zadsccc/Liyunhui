package com.example.liyunhui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableCaching       //自动缓存
@EnableSwagger2      //这个必须在这个控制器里面开启
@EnableScheduling     //开启定时
@ComponentScan(basePackages = {"com.example.liyunhui.controller","com.example.liyunhui.service.impl","com.example.liyunhui.dao.daoImpl"})
@MapperScan(basePackages = {"com.example.liyunhui.mapper"})
public class LiyunhuiApplication {

    public static void main( String[] args ) {
        SpringApplication.run(LiyunhuiApplication.class, args);
    }

}
