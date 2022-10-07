package com.facturacion.web.controller;

import com.facturacion.domain.dto.UserDTO;
import com.facturacion.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/all")
    public ResponseEntity<List<UserDTO>> getAll(){
        return  new ResponseEntity<>(usuarioService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Optional<ResponseEntity<UserDTO>> getOne(@PathVariable("id") Long userId){
    return usuarioService.getOne(userId)
            .map(usuario -> new ResponseEntity<>(usuario,HttpStatus.OK));
    }

    @PutMapping("/{id}")
    public Optional<ResponseEntity<UserDTO>> update(@RequestBody UserDTO user, long id){
       UserDTO u = usuarioService.update(user,id);
       return

    }

}
