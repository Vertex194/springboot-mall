package com.oscarjia.springbootmall.service;

import com.oscarjia.springbootmall.dto.CreateOrderRequest;

public interface OrderService {

    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
