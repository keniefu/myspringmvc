package com.cskaoyan.mapper;

import com.cskaoyan.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * StudentMapper interface
 * @author Keniefu
 * @date 2019/5/11
 */
public interface StudentMapper {

    /**
     * 查询数据库中一共有多少条student的数据
     * @return 数据库中一共有多少条student
     */
    int queryCount();

    /**
     * 使用该接口将student对象加入到数据库中
     * @param student 需要加入到数据库中的student的对象
     * @return 是否成功加入数据库
     */
    int insertStudent(Student student);

    /**
     * 传入id查询相应学生的name,如果数据库中没有这个id就返回null
     * @param id student中的唯一主键id
     * @return 该id对应的学生的姓名
     */
    String queryNameById(@Param("id") int id);

    /**
     * 传入age查询出数据库所有等于该age的年龄的学生姓名
     * @param age student的年龄
     * @return 该年龄的学生的name的list
     */
    List<String> queryNamesByAge(@Param("age") int age);

    /**
     * 传入id查询除该id的学生的对象
     * @param id student的id
     * @return 返回该id的学生对象
     */
    Student queryStudentById(@Param("id") int id);

    /**
     * 通过性别查看学生
     * @param gender student的性别属性
     * @return 该性别的学生
     */
    List<Student> queryStudentByGender(@Param("gender") String gender);

    /**
     * 通过lazy属性查找数据库中所有符合该属性的student的集合
     * @param lazy student的lazy属性
     * @return 符合该lazy属性的学生集合
     */
    List<Student> queryStudentByLazy(@Param("lazy") int lazy);
}
