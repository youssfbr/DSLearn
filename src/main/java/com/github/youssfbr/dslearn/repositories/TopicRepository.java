package com.github.youssfbr.dslearn.repositories;

import com.github.youssfbr.dslearn.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
