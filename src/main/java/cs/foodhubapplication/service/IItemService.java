package cs.foodhubapplication.service;

import cs.foodhubapplication.entity.Items;
import org.springframework.stereotype.Service;

@Service
public interface IItemService {
    public Items addItem(Items item);
}
