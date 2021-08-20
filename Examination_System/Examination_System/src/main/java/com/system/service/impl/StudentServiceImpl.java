package com.system.service.impl;

import com.system.mapper.StudentMapper;
import com.system.po.Student;
import com.system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Student
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    private void setStudentMapper(StudentMapper studentMapper ){
        this.studentMapper=studentMapper;
    }
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    public int delStudentById(Integer userID) {
        return studentMapper.delStudentById(userID);
    }

    public Student queryStudentById(Integer userID) {
        return studentMapper.queryStudentById(userID);
    }

    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    public List<Student> queryAllStudent() {
        return studentMapper.queryAllStudent();
    }
}
