package com.alvinlkk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

/**
 * @author alvinkk
 * @create 2018-05-16 11:22
 **/
@RestController
public class UserController {

    @GetMapping("/user")
    public Map<String, String> getUser(String id, String name) {
        System.out.println("id = [" + id + "], name = [" + name + "]");
        Map<String, String> map = new HashMap<>();
        map.put("code", "0000");
        return map;
    }
}
