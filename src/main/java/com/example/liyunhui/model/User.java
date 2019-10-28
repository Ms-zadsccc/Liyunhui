package com.example.liyunhui.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
@ApiModel(value = "user",description = "用user对象来接受用户")        //用对象来接受参数
@Data
public class User {
    @ApiModelProperty(value = "属性不能为空",name = "序号")
    @NotBlank(message = "id不能为空")
    private int id ;   //序号
    @ApiModelProperty(value = "名字不能为空",name = "name")
    @NotNull
    private String name;   //名字
    @ApiModelProperty(value = "年龄不能为空",name = "age")
    @Length(min = 2,max = 3,message = "最小长度为2位，最大为3位")
    private String age;   //年龄
    @ApiModelProperty(value = "性别不能为空",name = "gender")
    @NotNull(message = "性别不能为空")
    private int gender ;   //性别

}
