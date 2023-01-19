package br.com.cursoalura.microservice.fornecedor.controller;

import br.com.cursoalura.microservice.fornecedor.dto.ItemDoPedidoDTO;
import br.com.cursoalura.microservice.fornecedor.model.Pedido;
import br.com.cursoalura.microservice.fornecedor.service.PedidoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pedidos")
public class PedidoController {

    private static final Logger log = LoggerFactory.getLogger(PedidoController.class);
    @Autowired
    private PedidoService pedidoService;

    @RequestMapping(method = RequestMethod.POST)
    public Pedido realizaPedido(@RequestBody List<ItemDoPedidoDTO> produtos) {
        log.info("Pedido recebido");
        return pedidoService.realizaPedido(produtos);
    }

    @RequestMapping("/{id}")
    public Pedido getPedidoPorId(@PathVariable Long id) {
        return pedidoService.getPedidoPorId(id);
    }
}
