package com.nazax.ecommerce.services.UserSerivce;

import com.nazax.ecommerce.dtos.UserDTO.UserRequestDTO;
import com.nazax.ecommerce.dtos.UserDTO.UserResponseDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO salvar(UserRequestDTO dto);
    List<UserResponseDTO> listar();
}

