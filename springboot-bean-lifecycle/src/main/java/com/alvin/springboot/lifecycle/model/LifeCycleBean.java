package com.alvin.springboot.lifecycle.model;


import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class LifeCycleBean {

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
}
