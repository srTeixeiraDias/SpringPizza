package com.springpizza.service.impl;

import com.springpizza.service.EntregaService;
import lombok.RequiredArgsConstructor;
import com.springpizza.model.Entrega;
import org.springframework.stereotype.Service;
import com.springpizza.repository.EntregaRepository;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
@RequiredArgsConstructor
public class EntregaServiceImpl extends AbstractCrudService<Entrega, String, EntregaRepository> implements EntregaService {

    private final EntregaRepository entregaRepository;

    @Override
    public void confirmarRecebimento(Entrega entrega) {
        entrega.setHoraEntrega(LocalTime.now());
        entrega.setDataEntrega(LocalDate.now());
        entregaRepository.save(entrega);
    }

    @Override
    public Boolean verificarPagamento(Entrega entrega) {
        return entrega.getTipoPagamento()!= null;
    }

    @Override
    public EntregaRepository getRepository() {
        return entregaRepository;
    }
}
