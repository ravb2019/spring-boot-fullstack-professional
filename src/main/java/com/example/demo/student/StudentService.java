package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService
{
    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    public void addStudent(Student student)
    {
        this.studentRepository.save(student);
    }

    public void deleteStudent(Long studentId)
    {
        this.studentRepository.deleteById(studentId);
    }
}
