package com.nazax.ecommerce.controllers.UserController;

import com.nazax.ecommerce.dtos.UserDTO.UserRequestDTO;
import com.nazax.ecommerce.dtos.UserDTO.UserResponseDTO;
import com.nazax.ecommerce.services.UserSerivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/users")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ResponseEntity<List<UserResponseDTO>> findAll() {
        List<UserResponseDTO> users = userService.findAll();
        return ResponseEntity.ok().body(users);
    }

    @PostMapping("/")
    public ResponseEntity<UserResponseDTO> create(@RequestBody UserRequestDTO dto) {
        UserResponseDTO savedUser = userService.create(dto);
        return ResponseEntity.ok().body(savedUser);
    }
}
