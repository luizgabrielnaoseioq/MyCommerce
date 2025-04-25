package com.nazax.ecommerce.services.user;

import com.nazax.ecommerce.dtos.user.UserRequestDTO;
import com.nazax.ecommerce.dtos.user.UserResponseDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO create(UserRequestDTO dto);

    List<UserResponseDTO> findAll();
}