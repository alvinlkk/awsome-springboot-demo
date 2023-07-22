package com.alvinlkk.bean;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import lombok.Data;
import lombok.ToString;

@ConfigurationProperties(prefix = "my.user")
@Component
@ToString
@Validated
@Data
public class User {

    private String userName;

    @Max(value = 150, message = "最大值不能超过100岁")
    @Min(value = 10, message = "最大值不能超过10岁")
    private Integer age;

    private List<String> friends;
}
