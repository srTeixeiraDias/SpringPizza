package controller;

import lombok.RequiredArgsConstructor;
import model.Entrega;
import org.springframework.web.bind.annotation.*;
import service.EntregaService;

@RestController
@RequestMapping("entrega")
@RequiredArgsConstructor
public class EntregaController extends AbstractCrudController<Entrega, String, EntregaService> {

    private final EntregaService entregaService;
    @Override
    public EntregaService getService() {
        return entregaService;
    }

    @PostMapping("/confirmarRecebimento")
    public void confirmarRecebimento(@RequestBody Entrega entrega){
        entregaService.confirmarRecebimento(entrega);
    }

    @GetMapping("/verificarPagamento")
    public boolean verificarPagamento (@RequestBody Entrega entrega){
        return  entregaService.verificarPagamento(entrega);
    }
}
