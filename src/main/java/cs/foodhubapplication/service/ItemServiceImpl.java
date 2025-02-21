package cs.foodhubapplication.service;

import cs.foodhubapplication.entity.Items;
import cs.foodhubapplication.repository.IItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements IItemService{

    @Autowired
    private IItemsRepository itemsRepository;


    @Override
    public Items addItem(Items item) {
        return itemsRepository.save(item);
    }
}
