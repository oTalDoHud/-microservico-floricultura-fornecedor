package br.com.cursoalura.microservice.fornecedor.repository;

import br.com.cursoalura.microservice.fornecedor.model.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Long> {

}
