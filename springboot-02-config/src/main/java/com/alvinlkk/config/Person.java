package com.alvinlkk.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>描 述：</p>
 *
 * @author: cxw (cxw@my.com.cn)
 * @date: 2022/8/18  13:22
 * @version: 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;

    private Cat cat;
}
