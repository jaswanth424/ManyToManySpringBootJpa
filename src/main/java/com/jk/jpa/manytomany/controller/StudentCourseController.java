package com.jk.jpa.manytomany.controller;


import com.jk.jpa.manytomany.model.Student;
import com.jk.jpa.manytomany.repository.CourseRepository;
import com.jk.jpa.manytomany.repository.StudentRespository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentCourseController {


    private StudentRespository studentRespository;
    private CourseRepository courseRepository;

    public StudentCourseController(StudentRespository studentRespository, CourseRepository courseRepository) {
        this.studentRespository = studentRespository;
        this.courseRepository = courseRepository;
    }

    @PostMapping("/saveStudent")
    public Student saveStudentWithCourse(@RequestBody Student student){
       return studentRespository.save(student);
    }

    @GetMapping("/healthCheck")
    public String healthCheck(){
        return "Student Course API working.";
    }

    @GetMapping("/student/{student}")
    public List<Student> getStudents(@PathVariable String student){
        return studentRespository.findByStudentNameContaining("Ram");
    }
}
