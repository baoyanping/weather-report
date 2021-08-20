package com.system.service;

import com.system.po.Student;

import java.util.List;

/**
 * Student学生Service层
 */
public interface StudentService {

    public int addStudent(Student student);

    int delStudentById(Integer userID);

    Student queryStudentById(Integer userID);

    int updateStudent(Student student);

    List<Student> queryAllStudent();

}
