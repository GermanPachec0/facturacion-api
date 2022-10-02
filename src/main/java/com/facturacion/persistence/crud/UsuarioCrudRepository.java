package com.facturacion.persistence.crud;

import com.facturacion.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioCrudRepository extends CrudRepository<Usuario,Long> {
    
}
