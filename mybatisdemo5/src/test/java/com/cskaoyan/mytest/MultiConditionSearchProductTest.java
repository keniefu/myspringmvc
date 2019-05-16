package com.cskaoyan.mytest;

import com.cskaoyan.bean.PageHelper;
import com.cskaoyan.bean.Product;
import com.cskaoyan.bean.ProductSearchCriteria;
import com.cskaoyan.mapper.ProductMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class MultiConditionSearchProductTest {
    private SqlSessionFactory build;
    private SqlSession sqlSession;
    private Logger logger;
    @Before
    public void init() throws IOException {
        build = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis.xml"));
        logger = Logger.getLogger(MultiConditionSearchProductTest.class);
    }
    @After
    public void after() {
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void queryProductByCriteriaTest() {
        sqlSession = build.openSession();
        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
        ProductSearchCriteria productSearchCriteria = new ProductSearchCriteria(null,0,null,10,20);
        List<Product> products = mapper.queryProductByCriteria(productSearchCriteria);
        for (Product product : products) {
            logger.info(product);
        }
    }
    @Test
    public void queryProductThroughPageHelperTest() {
        sqlSession = build.openSession();
        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
        PageHelper pageHelper = mapper.queryProductThroughPageHelper(2);
        logger.info(pageHelper);
    }

    @Test
    public void queryProductThroughAllPageHelperTest() {
        sqlSession = build.openSession();
        ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
        PageHelper[] pageHelper = mapper.queryProductThroughAllPageHelper();
        for (PageHelper helper : pageHelper) {
            logger.info(helper);
        }
    }
}
