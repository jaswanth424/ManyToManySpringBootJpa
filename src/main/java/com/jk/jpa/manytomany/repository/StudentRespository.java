package com.jk.jpa.manytomany.repository;

import com.jk.jpa.manytomany.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRespository extends JpaRepository<Student, Integer> {

    List<Student> findByStudentNameContaining(String name);

}
