package com.github.youssfbr.dslearn.repositories;

import com.github.youssfbr.dslearn.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
