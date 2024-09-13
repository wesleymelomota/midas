package com.banco.br.midas.services;


import com.banco.br.midas.dtos.ClienteDto;
import com.banco.br.midas.models.Cliente;
import com.banco.br.midas.models.Endereco;
import com.banco.br.midas.repository.ClienteRepository;
import com.banco.br.midas.repository.EnderecoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
//@RequiredArgsConstructor
public class ClienteService {
	
    private final ClienteRepository repository;
    private final EnderecoRepository enderecoRepository;
    public ClienteService(ClienteRepository repository, EnderecoRepository endereco) {

        this.repository = repository;
        this.enderecoRepository = endereco;
    }

    public Integer salvarCliente(ClienteDto clienteDto){
        Cliente cliente = new Cliente();

        Endereco endereco = new Endereco(clienteDto.getEndereco());
        enderecoRepository.save(endereco);
        cliente.setNome(clienteDto.getNome());
        cliente.setCpf(clienteDto.getCpf());
        cliente.setEmail(clienteDto.getEmail());
        cliente.setCelular(clienteDto.getCelular());
        cliente.setEndereco(endereco);
        cliente.setNomeUsuario(clienteDto.getNomeUsuario());
        cliente.setSenha(clienteDto.getSenha());
        return repository.save(cliente).getCodigo();
    }
    public Optional<Cliente> obterClientePorCodigo(Integer codigo){
        return repository.findById(codigo);
    }
}
