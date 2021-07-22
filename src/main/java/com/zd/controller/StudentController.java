package com.zd.controller;

import com.zd.domain.Student;
import com.zd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @Description
 * @Author 笛
 * @create 2021/7/18 15:30
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService service;
    //添加学生
    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student){
        ModelAndView mv = new ModelAndView();
        int rows = service.addStudent(student);
        String msg = "注册失败！";
        if (rows>0){
            msg="注册成功！";
        }
        mv.addObject("msg",student.getName()+","+msg);
        mv.setViewName("result");
        return mv;
    }
}
