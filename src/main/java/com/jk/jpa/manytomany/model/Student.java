package com.jk.jpa.manytomany.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentId;
    private String studentName;
    private String city;


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "STUDENT_COURSE_TBL",
            joinColumns = {@JoinColumn(name = "student_id", referencedColumnName = "studentId")}
            , inverseJoinColumns = {
            @JoinColumn(name = "course_id", referencedColumnName = "courseId")
    }
    )
    private Set<Course> courses;

}
