package service.impl;

import lombok.RequiredArgsConstructor;
import model.Cliente;
import model.Pedido;
import org.springframework.stereotype.Service;
import repository.ClienteRepository;
import repository.PedidoRepository;
import service.ClienteService;

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
