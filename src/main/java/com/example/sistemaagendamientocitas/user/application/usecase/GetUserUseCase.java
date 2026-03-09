package com.example.sistemaagendamientocitas.user.application.usecase;

import com.example.sistemaagendamientocitas.user.application.dto.UserResponse;
import com.example.sistemaagendamientocitas.user.application.mapper.UserMapper;
import com.example.sistemaagendamientocitas.user.domain.model.User;
import com.example.sistemaagendamientocitas.user.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class GetUserUseCase {

    private final UserRepository userRepository;

    public GetUserUseCase (UserRepository userRepository ) { this.userRepository = userRepository; }

    public UserResponse execute (Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        return UserMapper.toResponse(user);
    }

}
