package com.nazax.ecommerce.services.product;

import com.nazax.ecommerce.dtos.product.ProductRequestDTO;
import com.nazax.ecommerce.dtos.product.ProductResponseDTO;

import java.util.List;

public interface ProductService {
    ProductResponseDTO save(ProductRequestDTO dto);
    List<ProductResponseDTO> findAll();
}

