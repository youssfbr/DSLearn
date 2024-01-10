package com.github.youssfbr.dslearn.repositories;

import com.github.youssfbr.dslearn.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
