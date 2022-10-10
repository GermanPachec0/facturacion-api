package com.facturacion.persistence;

import com.facturacion.domain.dto.UserDTO;
import com.facturacion.domain.repository.UserRepository;
import com.facturacion.persistence.crud.UsuarioCrudRepository;
import com.facturacion.persistence.entity.Usuario;
import com.facturacion.persistence.mapper.UsuarioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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
    @Override
    public Optional<UserDTO> getOne(Long userId){
        Optional<Usuario> usuario = usuarioCrudRepository.findById(userId);
        return  usuario.map(usuario1 -> mapper.toUser(usuario1));
    }

    @Override
    public UserDTO update(UserDTO user, long id){
        Usuario  usu = usuarioCrudRepository.findById(id).get();
        usu.setNombre(user.getUsername());
        usu.setApellido(user.getSurname());
        usu.setCuit(user.getCuit());
        usu.setTipoUsuario(user.getUserType());
        return  mapper.toUser(usuarioCrudRepository.save(usu));

    }


}