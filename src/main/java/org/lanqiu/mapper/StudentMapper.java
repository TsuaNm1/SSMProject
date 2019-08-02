package org.lanqiu.mapper;

import org.lanqiu.entity.Student;

public interface StudentMapper {
    public void addStudent(Student student);
    Student queryStudentByStuno(int stuno);
}
