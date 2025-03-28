package com.agile_library.biblioteca_api.dto;

import com.agile_library.biblioteca_api.enums.Roles;
import jakarta.validation.constraints.*;

public record RegisterDTO(
       @NotNull
       @Email(message = "O email deve ser válido.")
       String email,
       @Size(min = 3, max = 100, message = "Você deve inserir um nome maior.")
       @NotBlank
       String name,
       @Size(min = 8, max = 64, message = "Você deve inserir uma senha com no mínimo 8 carácteres.")
       @NotBlank 
       String password
       )
    {
}
