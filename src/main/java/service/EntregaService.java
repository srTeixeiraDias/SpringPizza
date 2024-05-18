package service;

import model.Entrega;

public interface EntregaService {

    void confirmarRecebimento(Entrega entrega);
    Boolean verificarPagamento(Entrega entrega);


}
