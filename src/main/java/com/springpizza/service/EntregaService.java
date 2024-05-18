package com.springpizza.service;

import com.springpizza.model.Entrega;

public interface EntregaService extends Crud<Entrega, String>{

    void confirmarRecebimento(Entrega entrega);
    Boolean verificarPagamento(Entrega entrega);


}
