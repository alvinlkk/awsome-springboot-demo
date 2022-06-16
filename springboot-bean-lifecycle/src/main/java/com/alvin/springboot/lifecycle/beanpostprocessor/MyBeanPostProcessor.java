package com.alvin.springboot.lifecycle.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("lifeCycleBean".equals(beanName)) {
            log.info("^^^^^^^^^^^^^^^^^^^^^^^^^MyBeanPostProcessor postProcessBeforeInitialization， [{}]", bean);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("lifeCycleBean".equals(beanName)) {
            log.info("^^^^^^^^^^^^^^^^^^^^^^^^^MyBeanPostProcessor postProcessAfterInitialization, [{}]", bean);
        }
        return bean;
    }
}
