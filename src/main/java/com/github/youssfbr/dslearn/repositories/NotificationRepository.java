package com.github.youssfbr.dslearn.repositories;

import com.github.youssfbr.dslearn.entities.Notification;
import com.github.youssfbr.dslearn.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

    Page<Notification> findByUser(User user, Pageable pageable);

}
