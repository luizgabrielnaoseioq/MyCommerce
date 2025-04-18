package com.nazax.ecommerce.exceptions.user;

import javax.management.relation.Role;
import java.util.Set;

public class UserResponseDTO {
    private Long id;
    private String nome;
    private String email;
    private String password;
    private Role role;
    private Set<String> nomesCursos;

    public UserResponseDTO() {

    }

    public UserResponseDTO(Long id, String nome, String email, String password, Role role, Set<String> nomesCursos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.role = role;
        this.nomesCursos = nomesCursos;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Set<String> getNomesCursos() {
        return nomesCursos;
    }

    public void setNomesCursos(Set<String> nomesCursos) {
        this.nomesCursos = nomesCursos;
    }
}
