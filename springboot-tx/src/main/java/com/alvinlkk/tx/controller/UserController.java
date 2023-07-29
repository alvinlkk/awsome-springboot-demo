/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvinlkk.tx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvinlkk.tx.pojo.User;
import com.alvinlkk.tx.service.UserService;

/**
 * 类的描述
 *
 * @author alvin
 * @version 7.x
 * @since 2023/4/21
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public String listAll() {
        List<User> users = userService.listAll();
        return "success";
    }
}
