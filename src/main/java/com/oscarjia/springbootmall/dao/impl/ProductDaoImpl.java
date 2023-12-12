package com.oscarjia.springbootmall.dao.impl;

import com.oscarjia.springbootmall.dao.ProductDao;
import com.oscarjia.springbootmall.model.Product;
import com.oscarjia.springbootmall.rowmapper.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.jdbc.core.JdbcOperationsExtensionsKt.query;

@Component
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Override
    public Product getProductById(Integer productId) {
        String sql="SELECT product_id, product_name, category, image_url, price, stock, description, " +
                "created_date, last_modified_date " +
                "FROM product WHERE product_id=:productId";
        Map<String,Object> map = new HashMap<>();
        map.put("productId",productId);

        List<Product> productList=namedParameterJdbcTemplate.query(sql,map,new ProductRowMapper());
        if (productList.size() > 0){
            return productList.get(0);
        }else {
            return null;
        }
    }
}
