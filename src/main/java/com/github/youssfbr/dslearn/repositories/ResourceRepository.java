package com.github.youssfbr.dslearn.repositories;

import com.github.youssfbr.dslearn.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}
