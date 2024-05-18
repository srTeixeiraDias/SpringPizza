package com.springpizza.service;

import com.springpizza.model.Cliente;
import com.springpizza.model.Pedido;

import java.util.List;

public interface ClienteService extends Crud<Cliente, String>{

    void adicionarPedido(Pedido pedido);
    List<Pedido> getPedidos();

}
