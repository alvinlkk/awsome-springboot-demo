package com.alvinlkk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 计划任务demo
 *
 */
@SpringBootApplication
@EnableScheduling
@EnableAsync
public class ScheduleApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ScheduleApplication.class, args);
    }
}
