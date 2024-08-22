package com.hellow.eventos.classes.cliente;

import com.hellow.eventos.classes.cliente.Cliente;
import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.evento.Evento;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="cliente")
@Table(name="cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id_cliente;

    private String nome;
    private String sobrenome;
    private String cpf;
    private Integer telefone;
    private String email;
    @ManyToOne
    @JoinColumn(name="evento_id")
    private Evento evento;

    @ManyToOne
    @JoinColumn(name="endereco_id")
    private Endereco endereco;

}
