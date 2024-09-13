package com.banco.br.midas.controller;

import com.banco.br.midas.dtos.ClienteDto;
import com.banco.br.midas.models.Cliente;
import com.banco.br.midas.services.ClienteService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    private ClienteService service;
    public ClienteController(ClienteService service){
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Integer criarCliente(@RequestBody ClienteDto cliente){
        return service.salvarCliente(cliente);
    }
    @GetMapping("/{codigo}")
    public Optional<Cliente> procurarClientePorCodigo(@PathVariable Integer codigo){
        return service.obterClientePorCodigo(codigo);/*.orElseThrow(() ->
                new ResponseStatusException(NOT_FOUND, "Cliente não encontrado"));*/
    }

}
