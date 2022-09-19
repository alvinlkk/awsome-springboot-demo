/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvin.springboot.aop.proxy.jdk;

import com.alvin.springboot.aop.service.UserService;
import com.alvin.springboot.aop.service.UserServiceImpl;

/**
 * 类的描述
 *
 * @author alvin
 * @date 2022/8/13
 * @since 1.0
 **/
public class JdkProxyTest {
    public static void main(String[] args) {
        // generate proxy file, under 'com/sun/proxy'
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        // proxy
        UserService userService = new UserLogProxy(new UserServiceImpl()).getProxy();

        // call methods
        userService.findUserList();
        userService.addUser();
    }
}
