package com.springpizza.service.impl;

import com.springpizza.service.PedidoService;
import lombok.RequiredArgsConstructor;
import com.springpizza.model.Item;
import com.springpizza.model.Pedido;
import org.springframework.stereotype.Service;
import com.springpizza.repository.EntregaRepository;
import com.springpizza.repository.ItemRepository;
import com.springpizza.repository.PedidoRepository;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class PedidoServiceImpl extends AbstractCrudService<Pedido, String, PedidoRepository> implements PedidoService {

    private final ItemRepository itemRepository;
    private final EntregaRepository entregaRepository;
    private final PedidoRepository pedidoRepository;

    @Override
    public BigDecimal calcularTotal(Pedido pedido) {
        return this.itemRepository.findByPedido(pedido).stream()
                .map(Item::getPrecoUnitario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public String verificarStatusEntrega(Pedido pedido) {
        final var entrega = this.entregaRepository.findById(pedido.getEntrega().getId()).orElseThrow();
        return entrega.getDataEntrega() != null ? "Entregue" : "Não entregue";
    }

    @Override
    public PedidoRepository getRepository() {
        return pedidoRepository;
    }
}
