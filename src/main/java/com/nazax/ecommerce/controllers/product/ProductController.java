package com.nazax.ecommerce.controllers.product;

import com.nazax.ecommerce.dtos.product.ProductRequestDTO;
import com.nazax.ecommerce.dtos.product.ProductResponseDTO;
import com.nazax.ecommerce.services.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/")
    public ResponseEntity<ProductResponseDTO> create(@RequestBody ProductRequestDTO dto) {
        return ResponseEntity.ok(productService.save(dto));
    }

    @GetMapping("/")
    public ResponseEntity<List<ProductResponseDTO>> getAll() {
        return ResponseEntity.ok(productService.findAll());
    }
}

