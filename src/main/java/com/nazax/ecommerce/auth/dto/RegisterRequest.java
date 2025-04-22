package com.nazax.ecommerce.auth.dto;

import com.nazax.ecommerce.enums.Role;
import lombok.Data;

@Data
public class RegisterRequest {
    private String name;
    private String email;
    private String password;
    private Role role;
}

