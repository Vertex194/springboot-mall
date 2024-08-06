package com.oscarjia.springbootmall.service;

import com.oscarjia.springbootmall.dto.CreateOrderRequest;
import com.oscarjia.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
