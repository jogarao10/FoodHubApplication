package cs.foodhubapplication.controller;

import cs.foodhubapplication.entity.Items;
import cs.foodhubapplication.repository.IItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Items")
public class ItemsController {

    @Autowired
    private IItemsRepository itemsRepository;

    @PostMapping("/save")
    public Items addItem(@RequestBody Items item) {
        return itemsRepository.save(item);
    }
}
