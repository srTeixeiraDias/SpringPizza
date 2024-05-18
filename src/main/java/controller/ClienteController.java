package controller;

import lombok.RequiredArgsConstructor;
import model.Cliente;
import model.Pedido;
import org.springframework.web.bind.annotation.*;
import service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("clientes")
@RequiredArgsConstructor
public class ClienteController extends AbstractCrudController<Cliente, String, ClienteService> {

    private final ClienteService clienteService;

    @Override
    public ClienteService getService() {
        return clienteService;
    }

    @PostMapping("/adicionarPedido")
    public void adicionarPedido(@RequestBody Pedido pedido){
        clienteService.adicionarPedido(pedido);
    }

    @GetMapping("/getPedidos")
    public List<Pedido> getPedidos(){
        return clienteService.getPedidos();
    }
}
