package com.nazax.ecommerce.services.user.mapper;

import com.nazax.ecommerce.dtos.user.UserRequestDTO;
import com.nazax.ecommerce.dtos.user.UserResponseDTO;
import com.nazax.ecommerce.models.Product;
import com.nazax.ecommerce.models.User;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    public User toEntity(UserRequestDTO dto, Set<User> products) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setRole(dto.getRole());
        user.setProducts(products);

        return user;
    }

    public UserResponseDTO toDTO(User user) {
        UserResponseDTO dto = new UserResponseDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setPassword(user.getPassword());
        dto.setRole(user.getRole());

        Set<String> nomesCursos = user.getProducts().stream()
                .map(Product::getName)
                .collect(Collectors.toSet());

        dto.setNamesProducts(nomesCursos);

        return dto;
    }
}
