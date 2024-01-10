package com.github.youssfbr.dslearn.repositories;

import com.github.youssfbr.dslearn.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
