package com.alvin.springboot.lifecycle.model;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class LifeCycleBean implements InitializingBean {

    private String prop;

    public LifeCycleBean() {
        log.info("%%%%%%%%%%%%%%%%%%%% LifeCycleBean 实例化");
    }

    public LifeCycleBean(String prop) {
        this.prop = prop;
    }

    public String getProp() {
        return prop;
    }


    @PostConstruct
    private void postContruct() {
        log.info("%%%%%%%%%%%%%%%%%%%% LifeCycleBean postContruct");
    }

    @PreDestroy
    private void preDestory() {
        log.info("%%%%%%%%%%%%%%%%%%%% LifeCycleBean preDestory");
    }


    public void setProp(String prop) {
        this.prop = prop;
    }


    public void init() {
        log.info("%%%%%%%%%%%%%%%%%%%% LifeCycleBean 初始化");
        this.setProp("hello");
    }

    public void destroy() {
        log.info("%%%%%%%%%%%%%%%%%%%% LifeCycleBean destroy");
        this.setProp("hello");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("%%%%%%%%%%%%%%%%%%%% LifeCycleBean afterPropertiesSet");
    }
}
