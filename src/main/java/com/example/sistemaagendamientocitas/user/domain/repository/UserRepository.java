package com.example.sistemaagendamientocitas.user.domain.repository;

import com.example.sistemaagendamientocitas.user.domain.model.User;
import com.example.sistemaagendamientocitas.user.infrastructure.persistence.entity.UserEntity;

import java.util.Optional;

public interface UserRepository {
    User save(User user);
    Optional<User> findById(Long id);
}
