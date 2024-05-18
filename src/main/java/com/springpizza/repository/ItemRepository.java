package com.springpizza.repository;

import com.springpizza.model.Item;
import com.springpizza.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, String> {

    List<Item> findByPedido(Pedido pedido);

}