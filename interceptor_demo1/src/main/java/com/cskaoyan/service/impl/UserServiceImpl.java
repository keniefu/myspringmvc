package com.cskaoyan.service.impl;

import com.cskaoyan.bean.Result;
import com.cskaoyan.bean.User;
import com.cskaoyan.dao.UserDao;
import com.cskaoyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public int register(User user) {
        int has = userDao.queryUserByUsername(user.getUsername());
        return 0;
    }

    @Override
    public void importData(File file) throws IOException {
        userDao.importData(file);
    }

    @Override
    public Result queryPhone(String phone) {

        return userDao.queryPhone(phone);
    }
}
