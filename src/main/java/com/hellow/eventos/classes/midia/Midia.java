package com.hellow.eventos.classes.midia;

import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="midia")
@Table(name="midia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Midia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id_midia;
    private String formato;
    private Integer duracao;
    private Integer tamanho;
    private String link;
    @ManyToOne
    @JoinColumn(name="tipo_id")
    @JoinColumn(name="evento_id")
    private Tipo tipo;

}
