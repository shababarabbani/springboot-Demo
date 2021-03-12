package com.shabab.demo.controller;

import com.shabab.demo.entity.Student;
import com.shabab.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/")
    public Student createStudent(@RequestBody Student student){
        log.info("Controller log");
        Student savedStudent=studentService.saveStudent(student);
        log.info("Saved student with id- {}",savedStudent.getSid());
        return savedStudent;
    }

    @GetMapping("/")
    public Student getStudent(@RequestParam String name){
        Student student = studentService.findStudent(name);
        return student;
    }
}



