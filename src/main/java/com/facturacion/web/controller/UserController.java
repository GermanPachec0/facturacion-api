package com.facturacion.web.controller;

import com.facturacion.domain.dto.UserDTO;
import com.facturacion.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.tools.jconsole.JConsole;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("")
    public ResponseEntity<List<UserDTO>> getAll(){
        return  new ResponseEntity<>(usuarioService.getAll(), HttpStatus.OK);
    }


}
