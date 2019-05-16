package com.cskaoyan.storeDemo.mapper;

import com.cskaoyan.storeDemo.bean.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    int regist(@Param("u") User user);

    int active(String checkid);

    User login(User user);

    String logincheck(@Param("username") String username);
}
