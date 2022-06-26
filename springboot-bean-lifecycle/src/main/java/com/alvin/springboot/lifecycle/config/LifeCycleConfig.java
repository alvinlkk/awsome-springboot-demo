/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvin.springboot.lifecycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alvin.springboot.lifecycle.bean.BeanLifeCycle;

/**
 * 类的描述
 *
 * @author alvin
 * @date 2022/6/16
 * @since 1.0
 **/
@Configuration
public class LifeCycleConfig {

    @Bean(name = "beanLifeCycle", initMethod = "init", destroyMethod = "destroy")
    public BeanLifeCycle createBeanLifeCycle() {
        BeanLifeCycle beanLifeCycle = new BeanLifeCycle();
        return beanLifeCycle;
    }
}
