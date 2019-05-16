package com.cskaoyan.mytest;

import com.cskaoyan.bean.Student;
import com.cskaoyan.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class StudentMapperTest {
    private SqlSession sqlSession;
    private StudentMapper mapper;
    @Before
    public void init() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        sqlSession = build.openSession();
        mapper = sqlSession.getMapper(StudentMapper.class);
    }
    @After
    public void after() {
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void insertStudentTest() {
        Student student = new Student(0,"zhanghanting","male",24,0,0);
        int i = mapper.insertStudent(student);
        System.out.println(i);
    }

    @Test
    public void queryCountTest() {
        int i = mapper.queryCount();
        System.out.println(i);
    }

    @Test
    public void queryNameById() {
        String s = mapper.queryNameById(2);
        System.out.println(s);
    }

    @Test
    public void queryStudentNameByAge() {
        List<String> strings = mapper.queryNamesByAge(22);
        System.out.println(strings);
    }

    @Test
    public void queryStudentByIdTest() {
        Student student = mapper.queryStudentById(2);
        System.out.println(student);
    }

    @Test
    public void queryStudentByGenderTest() {
        List<Student> students = mapper.queryStudentByGender("male");
        System.out.println(students);
    }

    @Test
    public void queryStudentByLazy() {
        List<Student> students = mapper.queryStudentByLazy(1);
        System.out.println(students);
    }

    @Test
    public void queryStudentByLazyTest() {
        List<Student> students = mapper.queryStudentByLazy(1);
        System.out.println(students);
    }
}
