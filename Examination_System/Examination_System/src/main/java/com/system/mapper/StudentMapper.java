package com.system.mapper;


import com.system.po.Student;

import java.util.List;

public interface StudentMapper {
    public int addStudent(Student student);

    int delStudentById(Integer userID);

    Student queryStudentById( Integer userID);

    int updateStudent(Student student);

    List<Student> queryAllStudent();
}