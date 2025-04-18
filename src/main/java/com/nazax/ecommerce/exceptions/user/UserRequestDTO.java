package com.nazax.ecommerce.exceptions.user;

import javax.management.relation.Role;
import java.util.Set;

public class UserRequestDTO {
    private String nome;
    private String email;
    private String password;
    private Role role;
    private Set<Long> idsCursos;

    public UserRequestDTO() {

    }

    public UserRequestDTO(String nome, String email, String password, Role role, Set<Long> idsCursos) {
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.role = role;
        this.idsCursos = idsCursos;
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

    public Set<Long> getIdsCursos() {
        return idsCursos;
    }

    public void setIdsCursos(Set<Long> idsCursos) {
        this.idsCursos = idsCursos;
    }
}

