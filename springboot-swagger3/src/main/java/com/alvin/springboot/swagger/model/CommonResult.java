package com.alvin.springboot.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>描 述：</p>
 *
 * @author: cxw (cxw@bsfit.com.cn)
 * @date: 2022/8/17  10:32
 * @version: 1.0.0
 */
@ApiModel("API通用数据")
public class CommonResult<T> {

    /**
     * 标识代码，0表示成功，非0表示出错
     */
    @ApiModelProperty("标识代码,0表示成功，非0表示出错")
    private Integer code;

    /**
     * 描述信息，通常错时使用
     */
    @ApiModelProperty("错误描述")
    private String msg;

    /**
     * 业务数据
     */
    @ApiModelProperty("业务数据")
    private T data;

    public CommonResult(Integer status, String msg, T data) {
        this.code = status;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 成功
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<>(0, "成功", data);
    }

    public static <T> CommonResult<T> success(Integer code, String msg) {
        return new CommonResult<>(code, msg, null);
    }

    /**
     * 错误
     */
    public static <T> CommonResult<T> error(int code, String msg) {
        return new CommonResult<>(code, msg, null);
    }

    // 省略getter/setter
}