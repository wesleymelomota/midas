package com.banco.br.midas.dtos;

import com.banco.br.midas.models.Cliente;
import com.banco.br.midas.models.Endereco;
import lombok.Data;
import org.springframework.beans.BeanUtils;
@Data
public class ClienteDto {
    private Integer codigo;
    private String nome;
    private String cpf;
    private String email;
    private String celular;
    private EnderecoDto endereco;
    private String nomeUsuario;
    private String senha;

    public ClienteDto convert(Cliente cliente) {
        BeanUtils.copyProperties(cliente, this, "senha");
        return this;
    }

}
