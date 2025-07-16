package com.edurmus.orders.service;

import com.edurmus.core.types.OrderStatus;
import com.edurmus.orders.dto.OrderHistory;

import java.util.List;
import java.util.UUID;

public interface OrderHistoryService {
    void add(UUID orderId, OrderStatus orderStatus);

    List<OrderHistory> findByOrderId(UUID orderId);
}
