package com.alvin.springboot.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvin.springboot.aop.service.UserService;

/**
 * <p>描 述：</p>
 *
 * @author: cxw (332059317@qq.com)
 * @date: 2022/12/22  17:58
 * @version: 1.0.0
 */
@RestController
@RequestMapping("/aop")
public class AopController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String aopTest() {
        userService.dealUsers();
        return "success";
    }

}
