package com.alvin.springboot.swagger.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alvin.springboot.swagger.model.CommonResult;
import com.alvin.springboot.swagger.model.Goods;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.v3.oas.annotations.Operation;
import springfox.documentation.annotations.ApiIgnore;

/**
 * <p>描 述：</p>
 *
 * @author: cxw (cxw@bsfit.com.cn)
 * @date: 2022/8/17  10:33
 * @version: 1.0.0
 */
@Api(tags = "订单管理接口")
@RestController
@RequestMapping("/order")
public class OrderController {

    @Operation(summary = "提交订单")
    @PostMapping("/order")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户id", dataTypeClass = Long.class, paramType = "query", example = "123"),
            @ApiImplicitParam(name = "goodsId", value = "商品id", dataTypeClass = Integer.class, paramType = "query", example = "1")
    })
    public CommonResult<Goods> toBuy(@ApiIgnore @RequestParam Map<String, String> params) {
        System.out.println(params);
        return CommonResult.success(new Goods());
    }
}