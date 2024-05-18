package service.impl;

import lombok.RequiredArgsConstructor;
import model.Entrega;
import org.springframework.stereotype.Service;
import repository.EntregaRepository;
import service.EntregaService;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
@RequiredArgsConstructor
public class EntregaServiceImpl extends AbstractCrud<Entrega, String, EntregaRepository> implements EntregaService {

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
