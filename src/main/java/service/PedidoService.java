package service;

import model.Cliente;
import model.Pedido;

import java.math.BigDecimal;

public interface PedidoService extends Crud<Pedido, String>{

    BigDecimal calcularTotal(Pedido pedido);
    String verificarStatusEntrega(Pedido pedido);
}
