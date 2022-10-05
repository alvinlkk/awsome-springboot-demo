package com.alvinlkk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple LogApplication.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LogApplicationTest {

    Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 日志级别： 由低到高  trace<debug<info<warn<error
     */
    @Test
    public void contextLoad() {
        logger.trace("这是trace 日志");
        logger.debug("这是debug日志");
        //SpringBoot默认使用info级别，没有指定级别就用的默认规定的级别，root级别
        logger.info("这是info日志");
        logger.warn("这是warn日志");
        logger.error("这是error日志");
    }

}
