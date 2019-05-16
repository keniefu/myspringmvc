package com.cskaoyan.mytest;

import com.cskaoyan.bean.Course;
import com.cskaoyan.bean.Student;
import com.cskaoyan.bean.User;
import com.cskaoyan.mapper.StudentCourseMapper;
import com.cskaoyan.mapper.UserMapper;
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

public class UserMapperTest {
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
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void queryUserByIdTest() {
        sqlSession = build.openSession();
        SqlSession sqlSession1 = build.openSession();
        UserMapper mapper = this.sqlSession.getMapper(UserMapper.class);
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        User user = mapper.queryUserById(1);
        logger.info(user);
        sqlSession.commit();
        User user1 = mapper1.queryUserById(1);
        logger.info(user1);
    }

    @Test
    public void queryCourseByIdTest() {
        sqlSession = build.openSession();
        StudentCourseMapper mapper = sqlSession.getMapper(StudentCourseMapper.class);
        List<Course> course = mapper.queryCourseById(1);
        logger.info(course);
    }
    @Test
    public void queryCourseById2Test() {
        sqlSession = build.openSession();
        StudentCourseMapper mapper = sqlSession.getMapper(StudentCourseMapper.class);
        List<Course> course = mapper.queryCourseById2(1);
        logger.info(course);
    }

    @Test
    public void queryStudentByIdTest() {
        sqlSession = build.openSession();
        StudentCourseMapper mapper = sqlSession.getMapper(StudentCourseMapper.class);
        List<Student> students = mapper.queryStudentById(1);
        logger.info(students);
    }
}
