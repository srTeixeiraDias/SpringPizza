package service;

import model.Cliente;
import model.Pedido;

import java.util.List;

public interface ClienteService extends Crud<Cliente, String>{

    void adicionarPedido(Pedido pedido);
    List<Pedido> getPedidos();

}
