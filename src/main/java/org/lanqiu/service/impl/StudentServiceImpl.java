package org.lanqiu.service.impl;

import org.lanqiu.entity.Student;
import org.lanqiu.mapper.StudentMapper;
import org.lanqiu.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private  StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public Student queryStudentByNo(int stuNo) {
        return  studentMapper.queryStudentByStuno(stuNo);
    }
}
