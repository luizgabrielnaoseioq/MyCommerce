package com.nazax.ecommerce.repositories;

import com.nazax.ecommerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.Set;

public interface UserRepository extends JpaRepository<User, Long> {
    Set<User> findByIdIn(Set<Long> userIds);

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);
}
