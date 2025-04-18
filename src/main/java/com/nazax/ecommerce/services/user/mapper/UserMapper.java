package com.nazax.ecommerce.services.user.mapper;

import com.nazax.ecommerce.exceptions.user.UserRequestDTO;
import com.nazax.ecommerce.exceptions.user.UserResponseDTO;
import com.nazax.ecommerce.models.Product;
import com.nazax.ecommerce.models.User;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    public User toEntity(UserRequestDTO dto, Set<Product> cursos) {
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
                .map(Product::getNome)
                .collect(Collectors.toSet());

        dto.setNomesCursos(nomesCursos);

        return dto;
    }
}
