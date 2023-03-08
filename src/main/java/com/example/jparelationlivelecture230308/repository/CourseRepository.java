package com.example.jparelationlivelecture230308.repository;

import com.example.jparelationlivelecture230308.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
