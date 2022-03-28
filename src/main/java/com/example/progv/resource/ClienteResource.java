package com.example.progv.resource;

import com.example.progv.entity.Cliente;
import com.example.progv.entity.Produto;
import com.example.progv.repository.ClienteRepository;
import com.example.progv.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {
    @Autowired
    ClienteRepository produtoRepository;

    @Autowired
    ClienteService clienteService;

    @RequestMapping( method = RequestMethod.POST)
    public Cliente cadastrar(@RequestBody Cliente cliente){
        return this.clienteService.cadastrar(cliente);
    }

    @RequestMapping( method = RequestMethod.GET)
    public List<Cliente> listar(){
        return this.clienteService.listar();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Cliente consultarPorId(@PathVariable("id") Long id){
        return this.clienteService.consultarPorId(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Cliente alterar(@RequestBody Cliente cliente){
        return this.clienteService.cadastrar(cliente);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deletar(@PathVariable("id") Long id){
        this.clienteService.deleteById(id);
    }


}
