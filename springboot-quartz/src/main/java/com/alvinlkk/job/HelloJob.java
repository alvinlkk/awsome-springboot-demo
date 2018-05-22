package com.alvinlkk.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * hellojob
 *
 * @author alvinkk
 * @create 2018-04-09 16:03
 **/
public class HelloJob implements Job{
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("hello： " + new Date());
    }
}
