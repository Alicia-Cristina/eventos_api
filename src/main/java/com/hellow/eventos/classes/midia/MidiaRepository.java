package com.hellow.eventos.classes.midia;

import com.hellow.eventos.classes.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MidiaRepository extends JpaRepository<Usuario,Integer> {
}
