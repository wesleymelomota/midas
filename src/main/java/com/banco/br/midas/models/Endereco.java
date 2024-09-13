package com.banco.br.midas.models;

import com.banco.br.midas.dtos.EnderecoDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 70)
    private String rua;
    @Column(length = 10)
    private String numero;
    @Column(length=50)
    private String bairro;
    @Column(length=15)
    private String cep;
    @Column(length=80)
    private String complemento;

    public Endereco(EnderecoDto endereco){
        this.numero = endereco.getNumero();
        this.cep = endereco.getCep();
        this.bairro = endereco.getBairro();
        this.complemento = endereco.getComplemento();
        this.rua = endereco.getRua();
    }
}
