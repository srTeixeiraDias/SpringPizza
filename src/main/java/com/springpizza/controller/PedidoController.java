package com.springpizza.controller;

import lombok.RequiredArgsConstructor;
import com.springpizza.model.Pedido;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springpizza.service.PedidoService;

import java.math.BigDecimal;

@RestController
@RequestMapping("pedido")
@RequiredArgsConstructor
public class PedidoController extends AbstractCrudController<Pedido, String, PedidoService> {

    private final PedidoService pedidoService;

    @Override
    public PedidoService getService() {
        return pedidoService;
    }

    @PostMapping("/calcularTotal")
    public BigDecimal calcularTotal(@RequestBody Pedido pedido){
        return pedidoService.calcularTotal(pedido);
    }

    @PostMapping("/verificarStatus")
    public String verificarStatusEntrega(@RequestBody Pedido pedido){
        return pedidoService.verificarStatusEntrega(pedido);
    }
}
