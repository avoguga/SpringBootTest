package com.example.progv.service;

import com.example.progv.entity.Cliente;
import com.example.progv.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    // Regra de Negócio 01 - Obrigatório informar o NOME do Produto.

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente cadastrar(Cliente cliente) {

        if(cliente.getClientName() == null || "".equals(cliente.getClientName().trim())){
            throw new RuntimeException("Obrigatório informar o nome");
        }

        return clienteRepository.save(cliente);
    }

    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }

    public Cliente consultarPorId(Long id) { return this.clienteRepository.findById(id); }

    public Cliente alterar() { return (Cliente) clienteRepository.findAll(); }

    public Cliente deleteById(Long id) { return this.clienteRepository.deleteById(id); }

}
