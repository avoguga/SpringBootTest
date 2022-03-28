package com.example.progv.resource;

import com.example.progv.entity.Produto;
import com.example.progv.repository.ProdutoRepository;
import com.example.progv.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {
    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    ProdutoService produtoService;

    @RequestMapping( method = RequestMethod.POST)
    public Produto cadastrarListaService(@RequestBody Produto produto){
        return this.produtoService.cadastrar(produto);
    }

    @RequestMapping(value = "/produto", method = RequestMethod.GET)
    public List<Produto> listarProdutosService(){
        return this.produtoService.listar();
    }


    @Deprecated
    @RequestMapping(method = RequestMethod.GET)
    public List<Produto> listarProdutos(){
        return this.produtoRepository.findAll();
    }

    @Deprecated
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Produto consultarProdutosPorId(@PathVariable("id") Long id){
        return this.produtoRepository.findById(id);
    }

    @Deprecated
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public Produto cadastrarLista(@RequestBody Produto produto){
        return this.produtoRepository.save(produto);
    }

    @Deprecated
    @RequestMapping(method = RequestMethod.PUT)
    public Produto alterar(@RequestBody Produto produto){
        return this.produtoRepository.save(produto);
    }

    @Deprecated
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable("id") Long id){
        this.produtoRepository.deleteById(id);
    }
}
