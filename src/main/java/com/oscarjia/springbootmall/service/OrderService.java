package com.oscarjia.springbootmall.service;

import com.oscarjia.springbootmall.dto.CreateOrderRequest;
import com.oscarjia.springbootmall.dto.OrderQueryParams;
import com.oscarjia.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
