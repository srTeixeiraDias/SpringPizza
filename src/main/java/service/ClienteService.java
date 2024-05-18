package service;

import model.Pedido;

import java.util.List;

public interface ClienteService {

    void adicionarPedido(Pedido pedido);
    List<Pedido> getPedidos();

}
