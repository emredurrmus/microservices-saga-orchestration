package com.edurmus.orders.service;

import com.edurmus.core.dto.Order;

public interface OrderService {
    Order placeOrder(Order order);
}
