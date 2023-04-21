/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvinlkk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类的描述
 *
 * @author alvin
 * @version 7.x
 * @since 2023/4/18
 **/
@RestController
@RequestMapping("/alvin")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
