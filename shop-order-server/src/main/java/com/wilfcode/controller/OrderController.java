package com.wilfcode.controller;

import com.wilfcode.domain.Order;
import com.wilfcode.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j

public class OrderController {
    @Autowired
    private IOrderService orderService;
    @RequestMapping("/save")
    public Order order(Long pid, Long uid) {
        log.info("create order start and pid={}, number={}", pid, uid);
        Order order = orderService.createOrder(pid, uid);
        log.info("create order end and order={}", order);
        return order;
    }


}
