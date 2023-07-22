package com.alvin.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.EnableCaching;

/**
 * <p>SpringBoot 缓存APP </p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/4/10  12:43
 */
@SpringBootApplication
@EnableCaching
public class SpringCacheApp {

    public static void main(String[] args) {
        SpringApplication.run(Cache.class, args);
    }
}
