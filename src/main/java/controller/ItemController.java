package controller;

import lombok.RequiredArgsConstructor;
import model.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ItemService;

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
