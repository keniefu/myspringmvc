package com.cskaoyan.dao;

import com.cskaoyan.bean.Result;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface UserDao {
    int queryUserByUsername(String username);

    void importData(File file) throws IOException;

    Result queryPhone(String phone);
}
