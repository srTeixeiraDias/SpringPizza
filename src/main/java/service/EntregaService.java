package service;

import model.Cliente;
import model.Entrega;

public interface EntregaService extends Crud<Entrega, String>{

    void confirmarRecebimento(Entrega entrega);
    Boolean verificarPagamento(Entrega entrega);


}
