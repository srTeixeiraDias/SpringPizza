package repository;

import model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, String> {

  Optional<Cliente> findByTelefoneLikeIgnoreCase(@Nullable String telefone);
}