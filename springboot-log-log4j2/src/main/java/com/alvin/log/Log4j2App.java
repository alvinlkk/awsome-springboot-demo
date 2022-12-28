/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvin.log;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * 类的描述
 *
 * @author alvin
 * @date 2022/10/5
 * @since 1.0
 **/
@SpringBootApplication
@Slf4j
public class Log4j2App {

    public static void main(String[] args) {
        SpringApplication.run(Log4j2App.class, args);

        log.trace("Trace 日志...");
        log.debug("Debug 日志...");
        log.info("Info 日志...");
        log.warn("Warn 日志...");
        log.error("Error 日志...");
        try {
            int a = 1/0;
        } catch (Exception e) {
            log.error("error", e);
        }

    }
}

