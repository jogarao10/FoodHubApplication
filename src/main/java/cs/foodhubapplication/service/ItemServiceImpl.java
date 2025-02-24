package cs.foodhubapplication.service;

import cs.foodhubapplication.client.ItemClient;
import cs.foodhubapplication.entity.Items;
import cs.foodhubapplication.repository.IItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements IItemService{

    @Autowired
    private IItemsRepository itemsRepository;

    @Autowired
    private ItemClient itemClient;


    @Override
    public Items addItem(Items item) {
        return itemsRepository.save(item);
    }

    @Override
    public List<Items> getAllItems() {
        return itemsRepository.findAll();
    }

    @Override
    public Optional<Items> getItemById(int id) {
        return itemsRepository.findById(id);
    }
}
