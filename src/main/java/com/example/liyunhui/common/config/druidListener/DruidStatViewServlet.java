package com.example.liyunhui.common.config.druidListener;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

//@WebServlet(urlPatterns = "/druid/*",
//        initParams = {
//        @WebInitParam(name = "allow",value = ""), //ip白名单
//        @WebInitParam(name = "deny",value = ""), //ip黑名单
//        @WebInitParam(name = "loginUsername",value = "admin"), //用户名
//        @WebInitParam(name = "loginPassword",value = "admin"), //密码
//        @WebInitParam(name = "resetEnable",value = "true"), //禁用HTML页面上的"resetAll"功能
//        })
@Configuration
public class DruidStatViewServlet {
        @Bean
        public ServletRegistrationBean   druidConfiguration(){
                ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
                //添加初始化参数：initParams

                //白名单：
                servletRegistrationBean.addInitParameter("allow","127.0.0.1");

                //IP黑名单 (存在共同时，deny优先于allow) : 如果满足deny的话提示:Sorry, you are not permitted to view this page.
                servletRegistrationBean.addInitParameter("deny","192.168.0.114");

                //登录查看信息的账号密码.
                servletRegistrationBean.addInitParameter("loginUsername","admin");
                servletRegistrationBean.addInitParameter("loginPassword","123456");

                //是否能够重置数据.
                servletRegistrationBean.addInitParameter("resetEnable","false");
                return servletRegistrationBean;
        }
        @Bean
        public FilterRegistrationBean druidStatFilter(){
                FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());

                //添加过滤规则.
                filterRegistrationBean.addUrlPatterns("/*");

                //添加不需要忽略的格式信息.
                filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");

                return filterRegistrationBean;
        }
}
