package com.oscarjia.springbootmall.service.impl;

import com.oscarjia.springbootmall.dao.OrderDao;
import com.oscarjia.springbootmall.dao.ProductDao;
import com.oscarjia.springbootmall.dto.BuyItem;
import com.oscarjia.springbootmall.dto.CreateOrderRequest;
import com.oscarjia.springbootmall.model.Order;
import com.oscarjia.springbootmall.model.OrderItem;
import com.oscarjia.springbootmall.model.Product;
import com.oscarjia.springbootmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;

    @Override
    public Order getOrderById(Integer orderId) {
        Order order = orderDao.getOrderById(orderId);

        List<OrderItem> orderItemList = orderDao.getOrderItemsByOrderId(orderId);

        order.setOrderItemList(orderItemList);

        return order;
    }

    // 修改多個Table All or Never
    @Transactional
    @Override
    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest) {
        int totalAmount = 0;
        List<OrderItem> orderItemList = new ArrayList<>();

        for (BuyItem buyItem : createOrderRequest.getBuyItemList()){
            Product product = productDao.getProductById(buyItem.getProductId());

            // 計算總價錢
            int amount = buyItem.getQuantity() * product.getPrice();
            totalAmount = totalAmount + amount;

            // 轉換 BuyItem to OrderItem
            OrderItem orderItem = new OrderItem();
            orderItem.setProductId(buyItem.getProductId());
            orderItem.setQuantity(buyItem.getQuantity());
            orderItem.setAmount(amount);

            orderItemList.add(orderItem);
        }

        Integer orderId = orderDao.createOrder(userId,totalAmount);

        orderDao.createOrderItems(orderId,orderItemList);

        return orderId;
    }
}
