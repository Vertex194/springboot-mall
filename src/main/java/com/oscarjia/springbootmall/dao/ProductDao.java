package com.oscarjia.springbootmall.dao;

import com.oscarjia.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
