package br.com.cursoalura.microservice.fornecedor.controller;

import br.com.cursoalura.microservice.fornecedor.model.InfoFornecedor;
import br.com.cursoalura.microservice.fornecedor.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/info")
public class InfoController {

    @Autowired
    private InfoService service;

    @RequestMapping(value = "/{estado}")
    public InfoFornecedor getInforPorEstado(@PathVariable String estado) {
        return service.getInfoPorEstado(estado);
    }
}
