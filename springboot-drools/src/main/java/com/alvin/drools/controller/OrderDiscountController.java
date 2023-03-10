package com.alvin.drools.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alvin.drools.model.OrderDiscount;
import com.alvin.drools.model.OrderRequest;
import com.alvin.drools.service.OrderDiscountService;

/**
 * <p>order discount controller </p>
 *
 * @author cxw (332059317@qq.com)
 * @version 1.0.0
 * @since 2023/3/10  19:50
 */
@RestController
public class OrderDiscountController {

    @Autowired
    private OrderDiscountService orderDiscountService;

    @PostMapping("/get-discount")
    public ResponseEntity<OrderDiscount> getDiscount(@RequestBody OrderRequest orderRequest) {
        OrderDiscount discount = orderDiscountService.getDiscount(orderRequest);
        return new ResponseEntity<>(discount, HttpStatus.OK);
    }
}