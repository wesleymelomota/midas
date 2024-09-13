package com.banco.br.midas.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    @Column(length = 50 )
    private String nome;
    @Column(length=20)
    private String cpf;
    @Column(length=40)
    private String email;
    @Column(length=15)
    private String celular;
    @OneToOne
    private Endereco endereco;
    @Column(length=50)
    private String nomeUsuario;
    @Column(length=100)
    private String senha;
    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Conta conta;


}
