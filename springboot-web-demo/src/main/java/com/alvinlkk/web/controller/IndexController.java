package com.alvinlkk.web.controller;

import com.alvinlkk.web.mapper.UserMapper;
import com.alvinlkk.web.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

/**
 * @author alvinkk
 * @create 2018-05-09 23:47
 **/
@RestController
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/index")
    public Map<String, String> index() {
        Map<String, String> map = new HashMap<>();
        map.put("tafda", "ffffffff");
        map.put("tttestfff", "sfaffa2341111");
        return map;
    }

    @GetMapping("/users")
    public List<User> users() {
        return userMapper.getAll();
    }
}
