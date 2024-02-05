package com.wilfcode.service;

import com.wilfcode.domain.Order;

public interface IOrderService {
    Order createOrder(Long pid, Long number);
}
