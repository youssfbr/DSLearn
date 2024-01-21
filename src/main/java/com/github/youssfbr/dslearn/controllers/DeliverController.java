package com.github.youssfbr.dslearn.controllers;

import com.github.youssfbr.dslearn.dtos.DeliverRevisionDTO;
import com.github.youssfbr.dslearn.dtos.NotificationDTO;
import com.github.youssfbr.dslearn.services.DeliverService;
import com.github.youssfbr.dslearn.services.NotificationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliverController {
    private final DeliverService service;

    public DeliverController(DeliverService service) {
        this.service = service;
    }

    @PutMapping(value = "/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'INSTRUCTOR')")
    public ResponseEntity<Void> saveRevision(@PathVariable Long id, @RequestBody @Valid DeliverRevisionDTO dto) {
        service.saveRevision(id, dto);
        return ResponseEntity.noContent().build();
    }

}
