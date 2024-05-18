package repository;

import model.Entrega;
import model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.Nullable;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

public interface EntregaRepository extends JpaRepository<Entrega, String> {


}