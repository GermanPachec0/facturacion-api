package com.facturacion.domain.repository;

import com.facturacion.domain.dto.UserDTO;

import java.util.List;

public interface UserRepository {

   List<UserDTO> getAll();

}
