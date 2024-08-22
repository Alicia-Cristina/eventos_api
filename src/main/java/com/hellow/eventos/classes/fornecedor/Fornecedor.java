package com.hellow.eventos.classes.fornecedor;

import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="forneceor")
@Table(name="forneceor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id_fornecedor;

    private String nome;
    private Integer cnpj;
    private Boolean ativo;
    @ManyToOne
    @JoinColumn(name="tipo_id")
    private Tipo tipo;

}
