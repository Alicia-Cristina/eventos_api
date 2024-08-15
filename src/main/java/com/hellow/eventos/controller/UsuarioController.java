package com.hellow.eventos.controller;

import com.hellow.eventos.classes.cliente.Cliente;
import com.hellow.eventos.classes.usuario.Usuario;
import com.hellow.eventos.classes.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="usuario")
public class UsuarioController {
    @Autowired
    private UsuarioRepository UsuarioRepository;
    @GetMapping("todos")
    public List<Usuario> getAllUsuario(){return this.UsuarioRepository.findAll(); }
    @PostMapping("add")
    public Usuario addUsuario(@RequestBody Usuario usuario){
        this.UsuarioRepository.save(usuario);
        return usuario;
    }

}
