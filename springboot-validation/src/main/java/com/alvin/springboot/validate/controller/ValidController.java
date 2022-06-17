package com.alvin.springboot.validate.controller;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alvin.springboot.validate.pojo.UserInfoParam;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@Validated
public class ValidController {


    @PostMapping("/valid/test1")
    public String test1(@Validated @RequestBody UserInfoParam userInfoParam){
        log.info("validEntity is {}", userInfoParam);
        return "test1 valid success";
    }
}
