package com.cskaoyan.mytest;

import com.cskaoyan.bean.Student;
import com.cskaoyan.bean.StudentExample;
import com.cskaoyan.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MainTest {
    private SqlSessionFactory build;
    private SqlSession sqlSession;
    private Logger logger;
    @Before
    public void init() throws IOException {
        build = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis.xml"));
        logger = Logger.getLogger(this.getClass());
    }
    @After
    public void after() {
        if (sqlSession!=null) {
            sqlSession.commit();
            sqlSession.close();
        }
    }
    @Test
    public void myTest1() {
        File file = new File("abc.txt");
        logger.info(file.getAbsolutePath());
    }
    @Test
    public void myTest2() {
        sqlSession = build.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.selectByPrimaryKey(5);
        logger.info(student);
        Student student1 = new Student(8,"zhengjia",22,0,0,"male",1);
        int insert = mapper.insertSelective(student1);
        logger.info(insert);
    }
    @Test
    public void myTest3() {
        sqlSession = build.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andAgeBetween(10, 35).andNameLike("%zh%");
        List<Student> students = mapper.selectByExample(studentExample);
        System.out.println(students);
    }
}
