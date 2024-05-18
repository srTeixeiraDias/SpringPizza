package com.springpizza.controller;

import lombok.RequiredArgsConstructor;
import com.springpizza.model.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springpizza.service.ItemService;

@RestController
@RequestMapping("item")
@RequiredArgsConstructor
public class ItemController extends AbstractCrudController<Item, String, ItemService> {

    private final ItemService itemService;

    @Override
    public ItemService getService() {
        return itemService;
    }
}
