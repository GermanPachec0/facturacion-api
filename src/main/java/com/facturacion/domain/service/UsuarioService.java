package com.facturacion.domain.service;

import com.facturacion.domain.dto.UserDTO;
import com.facturacion.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getAll(){
        return userRepository.getAll();
    }
}
