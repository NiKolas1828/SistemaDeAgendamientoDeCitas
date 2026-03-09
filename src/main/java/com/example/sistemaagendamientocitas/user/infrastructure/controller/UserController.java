package com.example.sistemaagendamientocitas.user.infrastructure.controller;


import com.example.sistemaagendamientocitas.user.application.dto.UserRequest;
import com.example.sistemaagendamientocitas.user.application.dto.UserResponse;
import com.example.sistemaagendamientocitas.user.application.usecase.CreateUserUseCase;
import com.example.sistemaagendamientocitas.user.application.usecase.DeleteUserUseCase;
import com.example.sistemaagendamientocitas.user.application.usecase.GetUserUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController()
@RequestMapping("/api/user")
public class UserController {

    private final CreateUserUseCase createUserUseCase;
    private final GetUserUseCase getUserUseCase;
    private final DeleteUserUseCase deleteUserUseCase;

    public UserController(CreateUserUseCase createUserUseCase, GetUserUseCase getUserUseCase, DeleteUserUseCase deleteUserUseCase) {
        this.createUserUseCase = createUserUseCase;
        this.getUserUseCase = getUserUseCase;
        this.deleteUserUseCase = deleteUserUseCase;
    }

    @PostMapping("/")
    public ResponseEntity<UserResponse> create(@Valid @RequestBody UserRequest request) {
        return ResponseEntity.ok(createUserUseCase.execute(request));

    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok(getUserUseCase.execute(id));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        deleteUserUseCase.execute(id);
        return ResponseEntity.noContent().build();

    }
}
