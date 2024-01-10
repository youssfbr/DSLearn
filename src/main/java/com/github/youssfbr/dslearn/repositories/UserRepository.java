package com.github.youssfbr.dslearn.repositories;

import com.github.youssfbr.dslearn.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
