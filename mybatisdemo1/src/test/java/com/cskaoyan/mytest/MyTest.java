package com.cskaoyan.mytest;

import com.cskaoyan.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyTest {
    SqlSessionFactory build;
    SqlSession sqlSession;
    @Before
    public void init() throws IOException {
        System.out.println("before");
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
        build = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }
    @After
    public void after() {
        System.out.println("after");
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void queryTest() throws IOException {
        sqlSession = build.openSession();
        User user = sqlSession.selectOne("mynamespace.queryUserById", 2);
        System.out.println(user);
    }
    @Test
    public void myTest() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        User user = new User(0, "zhangsong", "123456", "aaa@163.com");
        int mynamespace = sqlSession.insert("mynamespace.insertUser", user);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(mynamespace);
    }
    @Test
    public void myTest2() throws IOException {
        sqlSession = build.openSession();
        User user = new User(2, "rousong", "123456", "aaa@163.com");
        int update = sqlSession.update("mynamespace.updateUserById", user);
        System.out.println(update);
    }
}
