package com.hellow.eventos.classes.ingresso;

import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name="ingresso")
@Table(name="ingresso")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ingresso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id_ingresso;

    private Float valor_base;
    private Boolean meia;
    private Boolean social;
    private Float valor_pago;
    private Boolean pago;
    private Boolean vip;
    @ManyToOne
    @JoinColumn(name="tipo_id")
    private Tipo tipo;
}
