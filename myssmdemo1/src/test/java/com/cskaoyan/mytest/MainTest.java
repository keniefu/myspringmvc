package com.cskaoyan.mytest;

import com.cskaoyan.bean.User;
import com.cskaoyan.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class MainTest {
    @Autowired
//    @Qualifier("mapper")
//    @Resource(name = "mapper")
    UserMapper userMapper;
    @Test
    public void myTest1() {
        User user = userMapper.queryUserById(1);
        System.out.println(user);
    }
}
