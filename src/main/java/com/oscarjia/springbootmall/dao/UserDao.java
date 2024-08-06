package com.oscarjia.springbootmall.dao;

import com.oscarjia.springbootmall.dto.UserRegisterRequest;
import com.oscarjia.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
