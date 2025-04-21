package com.nazax.ecommerce.services.product.mapper;

import com.nazax.ecommerce.dtos.product.ProductRequestDTO;
import com.nazax.ecommerce.dtos.product.ProductResponseDTO;
import com.nazax.ecommerce.models.Product;
import com.nazax.ecommerce.models.User;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class ProductMapper {

    public Product toEntity(ProductRequestDTO dto, Set<User> users) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setImageUrl(dto.getImageUrl());
        product.setUsers(users);
        return product;
    }

    public ProductResponseDTO toDTO(Product product) {
        ProductResponseDTO dto = new ProductResponseDTO();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setDescription(product.getDescription());
        dto.setPrice(product.getPrice());
        dto.setImageUrl(product.getImageUrl());

        Set<String> usernames = product.getUsers().stream()
                .map(User::getName)
                .collect(Collectors.toSet());

        dto.setUsernames(usernames);

        return dto;
    }
}
