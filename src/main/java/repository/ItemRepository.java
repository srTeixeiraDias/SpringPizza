package repository;

import model.Item;
import model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;

import java.util.Collection;
import java.util.List;

public interface ItemRepository extends JpaRepository<Item, String> {

    List<Item> findByPedido(Pedido pedido);

}