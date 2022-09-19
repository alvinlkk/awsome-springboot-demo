/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvinlkk.task;

import lombok.SneakyThrows;

/**
 * 类的描述
 *
 * @author alvin
 * @date 2022/8/17
 * @since 1.0
 **/
public class SumRunnable implements Runnable {

    @SneakyThrows
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum = sum + i;
        }

        Thread.sleep(1000);
    }
}
