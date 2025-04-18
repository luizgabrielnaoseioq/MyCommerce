package com.nazax.ecommerce.services.UserSerivce;

import com.nazax.ecommerce.dtos.UserDTO.UserRequestDTO;
import com.nazax.ecommerce.dtos.UserDTO.UserResponseDTO;
import com.nazax.ecommerce.models.Curso;
import com.nazax.ecommerce.models.User;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    public User toEntity(UserRequestDTO dto, Set<Curso> cursos) {
        User user = new User();
        user.setUsername(dto.getNome());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setRole(dto.getRole());
        user.setCursos(cursos);

        return user;
    }

    public UserResponseDTO toDTO(User user) {
        UserResponseDTO dto = new UserResponseDTO();
        dto.setId(user.getId());
        dto.setNome(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setPassword(user.getPassword());
        dto.setRole(user.getRole());

        Set<String> nomesCursos = user.getCursos().stream()
                .map(Curso::getNome)
                .collect(Collectors.toSet());

        dto.setNomesCursos(nomesCursos);

        return dto;
    }
}
