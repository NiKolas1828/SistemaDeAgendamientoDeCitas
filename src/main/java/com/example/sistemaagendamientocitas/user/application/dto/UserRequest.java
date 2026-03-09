package com.example.sistemaagendamientocitas.user.application.dto;

import com.example.sistemaagendamientocitas.user.infrastructure.persistence.entity.RoleEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.*;

@Getter
@Setter
@NoArgsConstructor
public class UserRequest {

    @NotBlank(message = "El nombre es obligatorio")
    private String name;

    @Email(message = "Debe ser un correo válido")
    @NotBlank(message = "El email es obligatorio")
    private String email;

    @NotBlank(message = "El teléfono es obligatorio")
    private String phoneNumber;

    @NotBlank(message = "La contraseña es obligatoria")
    private String password;

    @NotNull(message = "El rol es obligatorio")
    private RoleEntity role;
}
