package com.github.youssfbr.dslearn.services;

import com.github.youssfbr.dslearn.dtos.NotificationDTO;
import com.github.youssfbr.dslearn.entities.Notification;
import com.github.youssfbr.dslearn.entities.User;
import com.github.youssfbr.dslearn.repositories.NotificationRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NotificationService {

    private final NotificationRepository repository;
    private final AuthService authService;

    public NotificationService(NotificationRepository repository , AuthService authService) {
        this.repository = repository;
        this.authService = authService;
    }

    @Transactional(readOnly = true)
    public Page<NotificationDTO> notificationsForCurrentUser(Pageable pageable) {
        final User user = authService.authenticated();
        final Page<Notification> page = repository.findByUser(user , pageable);
        return page.map(NotificationDTO::new);
    }

}
