package com.example.sistemaagendamientocitas.user.application.dto;

import com.example.sistemaagendamientocitas.user.infrastructure.persistence.entity.RoleEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class UserResponse {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private RoleEntity role;
    private boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
