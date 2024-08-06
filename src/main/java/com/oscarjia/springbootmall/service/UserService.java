package com.oscarjia.springbootmall.service;

import com.oscarjia.springbootmall.dto.UserLoginRequest;
import com.oscarjia.springbootmall.dto.UserRegisterRequest;
import com.oscarjia.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
