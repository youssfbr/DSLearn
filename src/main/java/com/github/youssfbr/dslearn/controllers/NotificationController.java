package com.github.youssfbr.dslearn.controllers;

import com.github.youssfbr.dslearn.dtos.NotificationDTO;
import com.github.youssfbr.dslearn.dtos.UserDTO;
import com.github.youssfbr.dslearn.services.NotificationService;
import com.github.youssfbr.dslearn.services.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationController {
    private final NotificationService service;
    public NotificationController(NotificationService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Page<NotificationDTO>> notificationsForCurrentUser(Pageable pageable) {
        final Page<NotificationDTO> page = service.notificationsForCurrentUser(pageable);
        return ResponseEntity.ok().body(page);
    }

}
