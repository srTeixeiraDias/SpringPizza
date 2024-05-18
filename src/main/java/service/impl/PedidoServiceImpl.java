package service.impl;

import lombok.RequiredArgsConstructor;
import model.Item;
import model.Pedido;
import org.springframework.stereotype.Service;
import repository.EntregaRepository;
import repository.ItemRepository;
import service.PedidoService;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class PedidoServiceImpl implements PedidoService {

    private final ItemRepository itemRepository;
    private final EntregaRepository entregaRepository;

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
}
