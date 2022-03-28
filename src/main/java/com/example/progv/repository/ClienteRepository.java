package com.example.progv.repository;

import com.example.progv.entity.Cliente;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ClienteRepository extends Repository<Cliente, Long> {

    List<Cliente> findAll();
    Cliente findById(Long id);
    Cliente save(Cliente cliente);
    Cliente deleteById(Long id);
}
