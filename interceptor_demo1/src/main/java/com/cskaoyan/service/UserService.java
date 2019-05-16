package com.cskaoyan.service;

import com.cskaoyan.bean.Result;
import com.cskaoyan.bean.User;

import java.io.File;
import java.io.IOException;

public interface UserService {
    int register(User user);

    void importData(File file) throws IOException;

    Result queryPhone(String phone);
}
