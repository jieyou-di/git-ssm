package com.zd.dao;

import com.zd.domain.Student;

import java.util.List;

/**
 * @Description
 * @Author 笛
 * @create 2021/7/18 14:30
 */
public interface StudentDao {

    int insertStudent(Student student);

    List<Student> selectStudent();
}
