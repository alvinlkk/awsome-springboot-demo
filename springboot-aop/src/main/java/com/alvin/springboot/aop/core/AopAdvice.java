package com.alvin.springboot.aop.core;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <p>描 述：</p>
 *
 * @author: cxw (332059317@qq.com)
 * @date: 2022/12/22  18:00
 * @version: 1.0.0
 */
@Aspect
@Component
public class AopAdvice {

    @Pointcut("execution(* com.alvin.springboot.aop.service.*.*(..))")
    public void userPoint() {

    }

    @Around("userPoint()")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("before ...." + proceedingJoinPoint.getSignature());
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("after ...." + proceedingJoinPoint.getSignature());
    }

}
