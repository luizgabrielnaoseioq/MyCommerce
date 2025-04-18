package com.nazax.ecommerce.models;


import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "cursos")
    private Set<User> usuarios;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(id, curso.id) && Objects.equals(nome, curso.nome) && Objects.equals(usuarios, curso.usuarios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, usuarios);
    }

    public Curso() {

    }

    public Curso(Long id, String nome, Set<User> usuarios) {
        this.id = id;
        this.nome = nome;
        this.usuarios = usuarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<User> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<User> usuarios) {
        this.usuarios = usuarios;
    }
}
