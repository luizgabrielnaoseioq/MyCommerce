package com.nazax.ecommerce.services.UserSerivce;

// UserServiceImpl.java
import com.nazax.ecommerce.dtos.UserDTO.UserRequestDTO;
import com.nazax.ecommerce.dtos.UserDTO.UserResponseDTO;
import com.nazax.ecommerce.repositorys.CursoRepository;
import com.nazax.ecommerce.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserResponseDTO salvar(UserRequestDTO dto) {
        var cursos = cursoRepository.findByIdIn(dto.getIdsCursos());
        var user = userMapper.toEntity(dto, cursos);
        var salvo = userRepository.save(user);
        return userMapper.toDTO(salvo);
    }

    @Override
    public UserResponseDTO salvar(UserRequestDTO dto) {
        return null;
    }

    @Override
    public List<UserResponseDTO> listar() {
        return userRepository.findAll().stream()
                .map(userMapper::toDTO)
                .collect(Collectors.toList());
    }
}

