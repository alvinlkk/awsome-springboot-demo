/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvinlkk.bean;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import lombok.ToString;

/**
 * 类的描述
 *
 * @author alvin
 * @date 2022/6/25
 * @since 1.0
 **/
@Component
@ToString
public class ValueTestBean {

    @Value("hello")
    private String plainStr;

    @Value("${bsfit.user.userName:}")
    private String userName;

    @Value("${bsfit.user.age}")
    private Integer age;

    @Value("${bsfit.user.friends:}")
    private List<String> friends;

    private String sex;

    private String userId;

    @Value("#{ T(java.lang.Math).random() * 100.0 }")
    private double randomNumber;

    @Value("#{systemProperties['os.name']}")
    private String systemPropertiesName; // 注入操作系统属性

    @Value("#{person.birth}")
    private Date personBirth;

    @Value("http://www.baidu.com")
    private Resource url; // 注入URL资源

    @Value("classpath:person.properties")
    private Resource resourceFile; // 注入文件资源

    @Value("${bsfit.user.sex}")
    public void setSex(String sex) {
        this.sex = sex;
    }

    @Autowired
    public void setUserId(@Value("${bsfit.user.userId}") String userId) {
        this.userId = userId;
    }
}
