package com.hellow.eventos.controller;

import com.hellow.eventos.classes.cliente.Cliente;
import com.hellow.eventos.classes.cliente.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;
    @GetMapping("todos")
    public List<Cliente> getAllCliente(){return this.clienteRepository.findAll(); }

    @PostMapping("add")
    public Cliente addCliente(@RequestBody Cliente cliente){
        this.clienteRepository.save(cliente);
        return cliente;
    }

}
