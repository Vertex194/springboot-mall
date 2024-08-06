package com.oscarjia.springbootmall.dao;

import com.oscarjia.springbootmall.model.Order;
import com.oscarjia.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId,Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
