package com.shabab.demo.service;

import com.shabab.demo.entity.Student;
import com.shabab.demo.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        log.info("Inside StudentService- saveStudent");
        return studentRepository.save(student);
    }

    public Student findStudent(String name) {
        log.info("Inside StudentService- findStudent");
        return studentRepository.findStudentByName(name);
    }
}
