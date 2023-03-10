package com.alvin.drools.model;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>order info</p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/3/10  19:46
 */
@Getter
@Setter
public class OrderRequest {

    private String customerNumber;
    private Integer age;
    private Integer amount;
    private CustomerType customerType;
}