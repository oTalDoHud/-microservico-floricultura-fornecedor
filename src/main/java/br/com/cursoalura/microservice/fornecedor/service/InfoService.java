package br.com.cursoalura.microservice.fornecedor.service;

import br.com.cursoalura.microservice.fornecedor.model.InfoFornecedor;
import br.com.cursoalura.microservice.fornecedor.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    @Autowired
    private InfoRepository repository;

    public InfoFornecedor getInfoPorEstado(String estado) {
        return repository.findByEstado(estado);
    }
}
