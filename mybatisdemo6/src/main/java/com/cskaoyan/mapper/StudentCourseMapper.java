package com.cskaoyan.mapper;

import com.cskaoyan.bean.Course;
import com.cskaoyan.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Keniefu
 * @date 2019/5/14
 */
public interface StudentCourseMapper {
    /**
     * 根据id查询对应的student
     * @param id student的id
     * @return 根据id查询到的student的对象集合
     */
    List<Student> queryStudentById(@Param("id") int id);

    /**
     * 根据id查询对应的course,通过左外连接的方式实现
     * @param id id course的id
     * @return 根据id查询到的course的对象集合
     */
    List<Course> queryCourseById(@Param("id") int id);
    /**
     * 根据id查询对应的course,通过分次查询的方式实现
     * @param id id course的id
     * @return 根据id查询到的course的对象集合
     */
    List<Course> queryCourseById2(@Param("id") int id);
}
