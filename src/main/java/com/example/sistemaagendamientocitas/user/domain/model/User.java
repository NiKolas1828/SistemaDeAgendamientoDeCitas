package com.example.sistemaagendamientocitas.user.domain.model;

import com.example.sistemaagendamientocitas.user.infrastructure.persistence.entity.RoleEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private RoleEntity role;
    private boolean active;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public User(String name, String email, String phoneNumber, String password, RoleEntity role) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.role = role;
        this.active = true;
    }
}
