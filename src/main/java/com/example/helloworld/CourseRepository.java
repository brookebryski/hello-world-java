package com.example.helloworld;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.helloworld.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
