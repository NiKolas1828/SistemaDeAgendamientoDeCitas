package com.example.sistemaagendamientocitas.user.application.usecase;

import com.example.sistemaagendamientocitas.user.domain.model.User;
import com.example.sistemaagendamientocitas.user.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class DeleteUserUseCase {

    private final UserRepository userRepository;

    public DeleteUserUseCase (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void execute(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        user.setActive(false);
        userRepository.save(user);
    }

}
