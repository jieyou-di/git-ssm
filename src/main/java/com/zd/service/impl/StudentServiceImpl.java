package com.zd.service.impl;

import com.zd.dao.StudentDao;
import com.zd.domain.Student;
import com.zd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author 笛
 * @create 2021/7/18 15:19
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao dao;

    @Override
    public int addStudent(Student student) {
        int rows = dao.insertStudent(student);
        return rows;
    }

    @Override
    public List<Student> quertyStudent() {
        List<Student> list = dao.selectStudent();
        return list;
    }
}
