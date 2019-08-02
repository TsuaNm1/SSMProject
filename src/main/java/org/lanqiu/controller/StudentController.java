package org.lanqiu.controller;

import org.lanqiu.entity.Student;
import org.lanqiu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("controller")
@Controller
public class StudentController {

    @Autowired
    @Qualifier("studentService")
    private  StudentService studentService;
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("queryStudentByNo/{stuno}")
    public String queryStudentByNo(@PathVariable("stuno") Integer stuNo, Map<String,Object> map){
        Student student = studentService.queryStudentByNo(stuNo);
        map.put("student",student);
        return  "result";
    }
}
