package com.example.sistemaagendamientocitas.user.infrastructure.persistence.repository;

import com.example.sistemaagendamientocitas.user.infrastructure.persistence.entity.RoleEntity;
import com.example.sistemaagendamientocitas.user.infrastructure.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringRepositoryPersistence extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByActiveTrueAndRole(RoleEntity role);
}
