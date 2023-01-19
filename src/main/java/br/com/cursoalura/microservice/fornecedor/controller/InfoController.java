package br.com.cursoalura.microservice.fornecedor.controller;

import br.com.cursoalura.microservice.fornecedor.model.InfoFornecedor;
import br.com.cursoalura.microservice.fornecedor.service.InfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/info")
public class InfoController {

    private static final Logger log = LoggerFactory.getLogger(InfoController.class);
    @Autowired
    private InfoService service;

    @RequestMapping(value = "/{estado}")
    public InfoFornecedor getInforPorEstado(@PathVariable String estado) {
        log.info("Recebido pedido de informações do fornecedor de {}", estado);
        return service.getInfoPorEstado(estado);
    }
}
