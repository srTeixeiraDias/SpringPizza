package service;

import model.Pedido;

import java.math.BigDecimal;

public interface PedidoService {

    BigDecimal calcularTotal(Pedido pedido);
    String verificarStatusEntrega(Pedido pedido);
}
