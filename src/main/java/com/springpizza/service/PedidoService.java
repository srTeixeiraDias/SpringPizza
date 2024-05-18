package com.springpizza.service;

import com.springpizza.model.Pedido;

import java.math.BigDecimal;

public interface PedidoService extends Crud<Pedido, String>{

    BigDecimal calcularTotal(Pedido pedido);
    String verificarStatusEntrega(Pedido pedido);
}
