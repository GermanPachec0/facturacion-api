package com.facturacion.persistence.mapper;

import com.facturacion.domain.dto.UserDTO;
import com.facturacion.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    @Mappings({
            @Mapping(source = "idUsuario",target = "userId"),
            @Mapping(source = "nombre",target = "username"),
            @Mapping(source = "apellido", target = "surname"),
            @Mapping(source = "cuit",target = "cuit"),
            @Mapping(source = "tipoUsuario",target = "userType")
    })
    UserDTO toUser(Usuario usuario);
    List<UserDTO> toUsers(List<Usuario> usuarios);

    @InheritInverseConfiguration
    Usuario toUsuario(UserDTO userdto);


}
