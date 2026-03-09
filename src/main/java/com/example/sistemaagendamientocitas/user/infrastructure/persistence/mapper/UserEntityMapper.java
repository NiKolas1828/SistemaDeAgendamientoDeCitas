package com.example.sistemaagendamientocitas.user.infrastructure.persistence.mapper;

import com.example.sistemaagendamientocitas.user.domain.model.User;
import com.example.sistemaagendamientocitas.user.infrastructure.persistence.entity.RoleEntity;
import com.example.sistemaagendamientocitas.user.infrastructure.persistence.entity.UserEntity;


public class UserEntityMapper {

    public static User toDomain(UserEntity userEntity) {
        return new User(
                userEntity.getId(),
                userEntity.getName(),
                userEntity.getEmail(),
                userEntity.getPhoneNumber(),
                userEntity.getPassword(),
                userEntity.getRole(),
                userEntity.isActive(),
                userEntity.getCreatedAt(),
                userEntity.getUpdatedAt()
        );
    }

    public static UserEntity toEntity(User user) {

        return UserEntity.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .password(user.getPassword())
                .role(RoleEntity.valueOf(user.getRole().name()))
                .active(user.isActive())
                .build();
    }
}
