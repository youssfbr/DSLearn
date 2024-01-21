package com.github.youssfbr.dslearn.services;

import com.github.youssfbr.dslearn.entities.User;
import com.github.youssfbr.dslearn.repositories.UserRepository;
import com.github.youssfbr.dslearn.services.exceptions.ForbiddenException;
import com.github.youssfbr.dslearn.services.exceptions.UnauthorizedException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;
    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User authenticated() {
        try {
            final String username = SecurityContextHolder.getContext().getAuthentication().getName();
            return userRepository.findByEmail(username);
        }
        catch (Exception e) {
            throw new UnauthorizedException("Invalid User");
        }
    }

    public void validateSelfOrAdmin(Long userId) {
        final User user = authenticated();
        if (!user.getId().equals(userId) && !user.hasHole("ROLE_ADMIN")) {
            throw new ForbiddenException("Access denied");
        }
    }
}
