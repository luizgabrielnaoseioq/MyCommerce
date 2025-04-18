package com.nazax.ecommerce.repositorys;

import com.nazax.ecommerce.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    Set<Curso> findByIdIn(Set<Long> ids);
}
