package com.example.liyunhui.common.config.druidListener;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(filterName = "druidWebStatFilter",urlPatterns = "/",
        initParams = {
        @WebInitParam(name = "exclusions",value = "*.js,*.gif,*.jpg,*.bmp,*.css,*.ico,/druid/*")
        })
public class DruidStatFilter  extends WebStatFilter {
}
