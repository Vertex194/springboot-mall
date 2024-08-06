package com.oscarjia.springbootmall.service.impl;

import com.oscarjia.springbootmall.dao.UserDao;
import com.oscarjia.springbootmall.dto.UserRegisterRequest;
import com.oscarjia.springbootmall.model.User;
import com.oscarjia.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
