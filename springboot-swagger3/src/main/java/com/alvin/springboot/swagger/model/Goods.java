package com.alvin.springboot.swagger.model;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>描 述：</p>
 *
 * @author: cxw (cxw@my.com.cn)
 * @date: 2022/8/17  10:32
 * @version: 1.0.0
 */
@ApiModel("商品模型")
public class Goods {

    /**
     * 商品id
     */
    @ApiModelProperty("商品ID")
    Long goodsId;

    /**
     * 商品名称
     */
    @ApiModelProperty("商品名称")
    private String goodsName;

    /**
     * 商品价格
     */
    @ApiModelProperty("商品价格")
    private BigDecimal price;

    // 省略getter/setter
}