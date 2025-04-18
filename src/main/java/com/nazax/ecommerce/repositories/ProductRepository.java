package com.nazax.ecommerce.repositories;

import com.nazax.ecommerce.models.Product;
import com.nazax.ecommerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Set<User> findByIdIn(Set<Long> ids);
}
