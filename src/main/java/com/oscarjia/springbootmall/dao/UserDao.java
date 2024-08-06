package com.oscarjia.springbootmall.dao;

import com.oscarjia.springbootmall.dto.UserRegisterRequest;
import com.oscarjia.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
