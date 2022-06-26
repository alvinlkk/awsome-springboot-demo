/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvin.springboot.lifecycle.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * 类的描述
 *
 * @author alvin
 * @date 2022/6/16
 * @since 1.0
 **/
@Component
@Slf4j
public class TestBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if("beanLifeCycle".equals(beanName)) {
            log.info("################BeanPostProcessor before init: bean:[{}], beanName: [{}]", bean, beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if("beanLifeCycle".equals(beanName)) {
            log.info("################BeanPostProcessor after init: bean:[{}], beanName: [{}]", bean, beanName);
        }
        return bean;
    }
}
