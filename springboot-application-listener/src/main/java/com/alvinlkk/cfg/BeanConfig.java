package com.alvinlkk.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author alvinkk
 * @create 2018-05-08 11:36
 **/
@Configuration
public class BeanConfig {

    @Bean
    public ApplictaionStartListener applictaionStartListener() {
        return new ApplictaionStartListener();
    }
}
