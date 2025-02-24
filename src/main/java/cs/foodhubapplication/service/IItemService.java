package cs.foodhubapplication.service;

import cs.foodhubapplication.entity.Items;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface IItemService {
    public Items addItem(Items item);
    public List<Items> getAllItems();
    public Optional<Items> getItemById(int id);
}
