package com.nazax.ecommerce.services.product;

import com.nazax.ecommerce.dtos.product.ProductRequestDTO;
import com.nazax.ecommerce.dtos.product.ProductResponseDTO;
import com.nazax.ecommerce.models.Product;
import com.nazax.ecommerce.models.User;
import com.nazax.ecommerce.repositories.ProductRepository;
import com.nazax.ecommerce.repositories.UserRepository;
import com.nazax.ecommerce.services.product.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public ProductResponseDTO save(ProductRequestDTO dto) {
        Set<User> users = userRepository.findByIdIn(dto.getUserIds());
        Product product = productMapper.toEntity(dto, users);
        Product saved = productRepository.save(product);
        return productMapper.toDTO(saved);
    }

    @Override
    public List<ProductResponseDTO> findAll() {
        return productRepository.findAll().stream()
                .map(productMapper::toDTO)
                .collect(Collectors.toList());
    }
}


