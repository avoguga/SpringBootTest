package com.example.progv.repository;

import com.example.progv.entity.Produto;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ProdutoRepository extends Repository<Produto, Long> {

    List<Produto> findAll();
    Produto findById(Long id);
    Produto save(Produto produto);
    void deleteById(Long id);
}
