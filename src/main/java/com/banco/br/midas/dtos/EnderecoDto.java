package com.banco.br.midas.dtos;

import lombok.Data;

@Data
public class EnderecoDto {

    private Integer id;
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private String complemento;
}
