package com.facturacion.domain.repository;

import com.facturacion.domain.dto.UserDTO;
import org.apache.catalina.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

   List<UserDTO> getAll();

   Optional<UserDTO> getOne(Long userId);


}
