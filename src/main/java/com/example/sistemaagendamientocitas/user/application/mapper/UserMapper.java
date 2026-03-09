package com.example.sistemaagendamientocitas.user.application.mapper;

import com.example.sistemaagendamientocitas.user.application.dto.UserRequest;
import com.example.sistemaagendamientocitas.user.application.dto.UserResponse;
import com.example.sistemaagendamientocitas.user.domain.model.User;

public class UserMapper {

    public static UserResponse toResponse(User user) {
       return new UserResponse(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPhoneNumber(),
                user.getPassword(),
                user.getRole(),
                user.isActive(),
                user.getCreatedAt(),
                user.getUpdatedAt()
        );
    }

    public static User toDomain(UserRequest userRequest) {
        return new User(
                userRequest.getName(),
                userRequest.getEmail(),
                userRequest.getPhoneNumber(),
                userRequest.getPassword(),
                userRequest.getRole()
        );
    }
}
