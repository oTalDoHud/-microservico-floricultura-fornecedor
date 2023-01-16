package br.com.cursoalura.microservice.fornecedor.repository;

import br.com.cursoalura.microservice.fornecedor.model.InfoFornecedor;
import org.springframework.data.repository.CrudRepository;

public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {

    InfoFornecedor findByEstado(String estado);
}
