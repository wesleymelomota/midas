package com.banco.br.midas.models;

import com.banco.br.midas.enums.TipoTransacao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 60)
    private String nomeCliente;
    private Conta conta;
    private Double valorTransacionado;
    @Enumerated(EnumType.STRING)
    private TipoTransacao tipoTransacao;
    private LocalDate dataTransacao;
}
