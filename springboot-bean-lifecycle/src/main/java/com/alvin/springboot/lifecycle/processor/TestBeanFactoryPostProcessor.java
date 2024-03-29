package com.alvin.springboot.lifecycle.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import com.alvin.springboot.lifecycle.model.Student;
import com.alvin.springboot.lifecycle.model.User;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info("******************** TestBeanFactoryPostProcessor#postProcessBeanFactory ****************");
        log.info("******************** bean的数量：[{}] ****************", beanFactory.getBeanDefinitionCount());
        // 修改bean definition属性信息
        BeanDefinition userBeanDef = beanFactory.getBeanDefinition("student");
        userBeanDef.getPropertyValues().add("username", "cxw");

        // 快速初始化Bean
//        Student user = (Student)beanFactory.getBean("student");
//        log.info("student name: [{}]", user.getUsername());
    }
}
