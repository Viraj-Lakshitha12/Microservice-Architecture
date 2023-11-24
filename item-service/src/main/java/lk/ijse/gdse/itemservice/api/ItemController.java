package lk.ijse.gdse.itemservice.api;

import lk.ijse.gdse.itemservice.dto.ItemDTO;
import lk.ijse.gdse.itemservice.service.ItemService;
import lk.ijse.gdse.itemservice.util.DataTypeConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {
    @Autowired
    private final ItemService itemService;
    @Autowired
    private final DataTypeConversion dataTypeConversion;

    public ItemController(ItemService itemService, DataTypeConversion dataTypeConversion) {
        this.itemService = itemService;
        this.dataTypeConversion = dataTypeConversion;
    }

    @PostMapping("/saveUser")
    public void saveData(ItemDTO itemDTO){
        itemService.saveData(dataTypeConversion.getItemEntity(itemDTO));
    }

}
