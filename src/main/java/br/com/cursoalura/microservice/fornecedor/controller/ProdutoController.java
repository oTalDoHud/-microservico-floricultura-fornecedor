package br.com.cursoalura.microservice.fornecedor.controller;

import br.com.cursoalura.microservice.fornecedor.model.Produto;
import br.com.cursoalura.microservice.fornecedor.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @RequestMapping("/{estado}")
    public List<Produto> getProdutosPorEstado(@PathVariable("estado") String estado) {
        return produtoService.getProdutosPorEstado(estado);
    }
}
