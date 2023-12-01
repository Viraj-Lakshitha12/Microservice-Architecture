package lk.ijse.gdse.itemservice.service;

import lk.ijse.gdse.itemservice.entity.Item;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {

    void saveData(Item itemEntity);
}
