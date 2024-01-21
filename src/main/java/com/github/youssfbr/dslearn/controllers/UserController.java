package com.github.youssfbr.dslearn.controllers;

import com.github.youssfbr.dslearn.dtos.UserDTO;
import com.github.youssfbr.dslearn.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    private final UserService service;
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        final UserDTO dto = service.findById(id);
        return ResponseEntity.ok().body(dto);
    }

}
