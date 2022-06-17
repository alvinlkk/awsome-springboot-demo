package com.alvin.springboot.validate.pojo;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class UserInfoParam {

    private Long id;

    @Length(min = 6, max = 20, message = "userId长度必须位于6到20之间")
    private String userId;

    @NotBlank(message = "用户名是必填项")
    private String userName;

    @Email(message = "请填写正确的邮箱地址")
    private String email;

    @Max(value = 2, message = "最大值不能超过2")
    private Integer sex;

    @Past(message = "生日不能超过当前日期")
    private Date birthDate;

    private boolean isAdmin;
}
