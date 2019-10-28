package com.example.liyunhui.common.config.swagger;



import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 自定义配置文件实体类
 */
@Component
@EnableSwagger2
@ConfigurationProperties(prefix = "app")
@Data
public class SystemConfig {


    private String info;

    private String author;

    private String email;

    private String swaggerTitle;



    private String swaggerContactName;

    private String swaggerContactWebUrl;

    private String swaggerContactEmail;
    private String swaggerVersion;

    private String swaggerDescription;
    private String swaggerTermsOfServiceUrl;

}
