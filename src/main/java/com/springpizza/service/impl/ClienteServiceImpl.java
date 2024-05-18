package com.springpizza.service.impl;

import com.springpizza.service.ClienteService;
import lombok.RequiredArgsConstructor;
import com.springpizza.model.Cliente;
import com.springpizza.model.Pedido;
import org.springframework.stereotype.Service;
import com.springpizza.repository.ClienteRepository;
import com.springpizza.repository.PedidoRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl extends AbstractCrudService<Cliente, String, ClienteRepository> implements ClienteService {

    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;


    @Override
    public void adicionarPedido(final Pedido pedido) {
        this.pedidoRepository.save(pedido);
    }

    @Override
    public List<Pedido> getPedidos() {
        return this.pedidoRepository.findAll();
    }

    @Override
    public ClienteRepository getRepository() {
        return clienteRepository;
    }
}
