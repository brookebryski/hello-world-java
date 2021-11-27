package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository repository;

    //http://localhost8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return repository.findAll();
//        return Arrays.asList(new Course(1,"Learn Microservices", "Brooke"),
//                new Course(2,"Learn Full Stack with Angular and React", "Brooke"));
    }

    //http://localhost8080/courses/1

    @GetMapping("/courses/1")
    public Course getCourseDetails() {
        return new Course(1,"Learn Microservices", "Brooke");
    }
}
