package com.nazax.ecommerce.services.user;

import com.nazax.ecommerce.dtos.user.UserRequestDTO;
import com.nazax.ecommerce.dtos.user.UserResponseDTO;
import com.nazax.ecommerce.repositories.ProductRepository;
import com.nazax.ecommerce.repositories.UserRepository;
import com.nazax.ecommerce.services.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository cursoRepository;

    @Autowired
    private UserMapper userMapper;

    public UserResponseDTO salvar(UserRequestDTO dto) {
        var products = cursoRepository.findByIdIn(dto.getIdsProducts());
        var user = userMapper.toEntity(dto, products);
        var salvo = userRepository.save(user);
        return userMapper.toDTO(salvo);
    }

    public List<UserResponseDTO> listar() {
        return userRepository.findAll().stream()
                .map(userMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UserResponseDTO create(UserRequestDTO dto) {
        return null;
    }

    @Override
    public List<UserResponseDTO> findAll() {
        return List.of();
    }
}

