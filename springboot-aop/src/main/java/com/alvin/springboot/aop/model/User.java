/**
 * Copyright © 2010 浙江邦盛科技有限公司 版权所有
 */
package com.alvin.springboot.aop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 类的描述
 *
 * @author alvin
 * @date 2022/8/13
 * @since 1.0
 **/
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String username;

    private Integer age;
}
