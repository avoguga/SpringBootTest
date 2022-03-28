package com.example.progv.service;

import com.example.progv.entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.progv.repository.ProdutoRepository;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto cadastrar(Produto produto) {

        if(produto.getProductName() == null || "".equals(produto.getProductName().trim())){
            throw new RuntimeException("Obrigatório informar o nome");
        }

        return produtoRepository.save(produto);
    }

    public List<Produto> listar(){
        return produtoRepository.findAll();
    }


}
