package lk.ijse.gdse.itemservice.service.impl;

import lk.ijse.gdse.itemservice.entity.Item;
import lk.ijse.gdse.itemservice.repository.ItemServiceRepo;
import lk.ijse.gdse.itemservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemServiceRepo itemServiceRepo;
    @Override
    public void saveData(Item itemEntity) {
        itemServiceRepo.save(itemEntity);
    }
}
