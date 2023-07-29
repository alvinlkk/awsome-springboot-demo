/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvin.async.service;

import java.util.concurrent.Future;

/**
 * 类的描述
 *
 * @author alvin
 * @version 7.x
 * @since 2023/3/17
 **/
public interface AsyncService {

    void asyncMethod() throws InterruptedException;

    Future<String> futureMethod() throws InterruptedException;
}
