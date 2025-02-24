package cs.foodhubapplication.controller;

import cs.foodhubapplication.entity.Items;
import cs.foodhubapplication.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private IItemService itemService;

    @PostMapping("/save")
    public Items addItem(@RequestBody Items item) {
        return itemService.addItem(item);
    }

    @GetMapping("/all")
    public List<Items> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping("/{itemId}")
    public ResponseEntity<?> getItemById(@PathVariable Integer itemId) {
        Optional<Items> item = itemService.getItemById(itemId);
        if (item.isPresent()) {
            return ResponseEntity.ok(item.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"message\": \"Item ID " + itemId + " is not correct or does not exist\"}");
        }
    }

}
