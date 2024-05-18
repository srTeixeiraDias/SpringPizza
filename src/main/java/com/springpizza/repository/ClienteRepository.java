package com.springpizza.repository;

import com.springpizza.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, String> {

  Optional<Cliente> findByTelefoneLikeIgnoreCase(@Nullable String telefone);
}