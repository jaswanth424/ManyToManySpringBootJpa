package com.jk.jpa.manytomany.repository;

import com.jk.jpa.manytomany.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {

    List<Course> findByFeeLessThan(Integer fee);
}
