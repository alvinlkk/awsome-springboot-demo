/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvin.springboot.aop.proxy.cglib;

import com.alvin.springboot.aop.service.UserServiceImpl;

/**
 * 类的描述
 *
 * @author alvin
 * @date 2022/8/13
 * @since 1.0
 **/
public class CglibProxyTest {
    public static void main(String[] args) {
        // proxy
        UserServiceImpl userService = (UserServiceImpl) new CglibUserLogProxy().getUserLogProxy(new UserServiceImpl());

        // call methods
        userService.dealUsers();
        //userService.addUser();
    }
}
