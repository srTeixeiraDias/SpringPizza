package com.springpizza.service.impl;

import lombok.RequiredArgsConstructor;
import com.springpizza.model.Item;
import org.springframework.stereotype.Service;
import com.springpizza.repository.ItemRepository;
import com.springpizza.service.ItemService;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl extends AbstractCrudService<Item, String, ItemRepository> implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public ItemRepository getRepository() {
        return itemRepository;
    }
}
