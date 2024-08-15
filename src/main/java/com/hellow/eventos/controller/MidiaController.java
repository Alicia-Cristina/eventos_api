package com.hellow.eventos.controller;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.endereco.EnderecoRepository;
import com.hellow.eventos.classes.midia.Midia;
import com.hellow.eventos.classes.midia.MidiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path="midia")
public class MidiaController {
    @Autowired
    private MidiaRepository midiaRepository;
    @GetMapping("todos")
    public List<Midia> getAllMidia(){return this.midiaRepository.findAll(); }

    @PostMapping("add")
    public Midia addMidia(@RequestBody Midia midia) {
        this.midiaRepository.save(midia);
        return midia;
    }

}