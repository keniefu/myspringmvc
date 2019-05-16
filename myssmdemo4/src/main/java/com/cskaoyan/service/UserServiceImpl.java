package com.cskaoyan.service;


import com.cskaoyan.bean.User;
import com.cskaoyan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public boolean login(String username, String password) {
        User user = userMapper.queryUserByUsernameAndPassword(username, password);
        return user!=null;
    }
}
