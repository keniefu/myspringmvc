package com.cskaoyan;

import com.bean.Teacher;
import com.config.MyConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:application.xml")
public class MyTest {
//    @Resource(name = "teacher")
//    Teacher teacher;
    @Test
    public void myTest() {
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
//        Teacher teacher = applicationContext.getBean("teacher", Teacher.class);
//        System.out.println(teacher);
    }
}
