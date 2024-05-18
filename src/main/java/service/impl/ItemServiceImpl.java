package service.impl;

import lombok.RequiredArgsConstructor;
import model.Item;
import org.springframework.stereotype.Service;
import repository.ItemRepository;
import service.ItemService;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl extends AbstractCrudService<Item, String, ItemRepository> implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public ItemRepository getRepository() {
        return itemRepository;
    }
}
