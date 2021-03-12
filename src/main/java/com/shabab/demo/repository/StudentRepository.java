package com.shabab.demo.repository;

import com.shabab.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

    public Student findStudentByName(String name);

}
