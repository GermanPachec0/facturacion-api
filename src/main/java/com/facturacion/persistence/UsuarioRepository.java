package com.facturacion.persistence;

import com.facturacion.domain.dto.UserDTO;
import com.facturacion.domain.repository.UserRepository;
import com.facturacion.persistence.crud.UsuarioCrudRepository;
import com.facturacion.persistence.entity.Usuario;
import com.facturacion.persistence.mapper.UsuarioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public  class UsuarioRepository implements UserRepository {
    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;

    @Autowired
    UsuarioMapper mapper;

    @Override
    public List<UserDTO> getAll(){
        List<Usuario> usuarios = (List<Usuario>) usuarioCrudRepository.findAll();
        return  mapper.toUsers(usuarios);
    }
}