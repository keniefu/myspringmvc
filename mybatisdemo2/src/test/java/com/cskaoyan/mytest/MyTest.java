package com.cskaoyan.mytest;

import com.cskaoyan.storeDemo.bean.User;
import com.cskaoyan.storeDemo.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class MyTest {
//    SqlSessionFactory build;
    SqlSession sqlSession;
    UserMapper mapper;
    @Before
    public void init() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        sqlSession = build.openSession();
        mapper = sqlSession.getMapper(UserMapper.class);
    }

    @After
    public void after() {
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void myTest() throws ParseException {
        User user = new User(0,"lanzhao","lz","lz123","lz123@163.com",new SimpleDateFormat("yyyy-MM-dd").parse("1982-5-18"),new Date(), UUID.randomUUID().toString(), "no");
        int regist = mapper.regist(user);
        System.out.println(regist);
    }

    @Test
    public void myTest2() {
        int active = mapper.active("13ec75a8-4379-4004-8714-4e2dfb525b01");
        System.out.println(active);
    }

    @Test
    public void myTest3() {
        User user = new User();
        user.setUsername("liuzhonglei");
        user.setPassword("lzl123");
        User login = mapper.login(user);
        System.out.println(login);
    }

    @Test
    public void myTest4() {
        String username = "lanzhao";
        String isActive = mapper.logincheck(username);
        System.out.println(isActive);
    }
}
