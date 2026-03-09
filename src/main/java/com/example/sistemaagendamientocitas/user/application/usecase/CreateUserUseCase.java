package com.example.sistemaagendamientocitas.user.application.usecase;

import com.example.sistemaagendamientocitas.user.application.dto.UserRequest;
import com.example.sistemaagendamientocitas.user.application.dto.UserResponse;
import com.example.sistemaagendamientocitas.user.application.mapper.UserMapper;
import com.example.sistemaagendamientocitas.user.domain.model.User;
import com.example.sistemaagendamientocitas.user.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateUserUseCase{

    private final UserRepository userRepository;

    public CreateUserUseCase (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse execute(UserRequest request) {
        User user = UserMapper.toDomain(request);

        return UserMapper.toResponse(userRepository.save(user));
    }
}
