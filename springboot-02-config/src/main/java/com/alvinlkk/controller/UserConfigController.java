package com.alvinlkk.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvinlkk.bean.User;

/**
 * <p>描 述：</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/7/22  16:02
 */
@RestController
@RequestMapping("/config")
public class UserConfigController implements ApplicationContextAware {

    private ApplicationContext context;

    @Autowired
    private User user1;

    @GetMapping("/username1")
    public String username1() {
        return user1.getUserName();
    }

    @GetMapping("/username2")
    public String username2() {
        User user = context.getBean(User.class);
        return user.getUserName();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
