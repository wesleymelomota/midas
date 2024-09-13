package com.banco.br.midas.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numeroConta;
    @OneToOne
    private Cliente cliente;
}
