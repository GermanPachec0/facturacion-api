package com.facturacion.domain.service;

import com.facturacion.domain.dto.UserDTO;
import com.facturacion.domain.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getAll(){
        return userRepository.getAll();
    }

    public Optional<UserDTO> getOne(Long userId){
        return  userRepository.getOne(userId);
    }

    public  UserDTO update(UserDTO user,Long id){return  userRepository.update(user,id);}

}
