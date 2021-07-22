package com.zd.service;

import com.zd.domain.Student;

import java.util.List;

/**
 * @Description
 * @Author 笛
 * @create 2021/7/18 15:17
 */
public interface StudentService {

    int addStudent(Student student);
    List<Student> quertyStudent();
}
