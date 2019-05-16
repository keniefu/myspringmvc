package com.cskaoyan.mytest;

import com.cskaoyan.bean.Order;
import com.cskaoyan.mapper.OrderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class OrderMapperTest {
    private SqlSession sqlSession;
    private OrderMapper mapper;
    @Before
    public void init() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        sqlSession = build.openSession();
        mapper = sqlSession.getMapper(OrderMapper.class);
    }
    @After
    public void after() {
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void insertOrder() {
        Order order = new Order(UUID.randomUUID().toString().substring(0,32),180,3,new Date(),2);
        int i = mapper.insertOrder(order);
        System.out.println(i);
    }
    @Test
    public void queryOrderByUid() {
        List<Order> orders = mapper.queryOrderByUid(1);
        System.out.println(orders);
    }
    @Test
    public void queryOrderByStateTest() {
        List<Order> orders = mapper.queryOrderByState(1);
        System.out.println(orders);
    }
    @Test
    public void queryOrderByMoneyRangeTest() {
        List<Order> orders = mapper.queryOrderByMoneyRange(500,350);
        System.out.println(orders);
    }
    @Test
    public void queryOrderByTimeRangeTest() {
        List<Order> orders = mapper.queryOrderByTimeRange(new Date(System.currentTimeMillis() - 24L*60*60*1000), new Date());
        System.out.println(orders);
    }
}
