package com.oscarjia.springbootmall.service.impl;

import com.oscarjia.springbootmall.dao.ProductDao;
import com.oscarjia.springbootmall.model.Product;
import com.oscarjia.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
