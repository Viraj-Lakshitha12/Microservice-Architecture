package lk.ijse.gdse.itemservice.api;

import lk.ijse.gdse.itemservice.dto.ItemDTO;
import lk.ijse.gdse.itemservice.entity.Item;
import lk.ijse.gdse.itemservice.service.ItemService;
import lk.ijse.gdse.itemservice.util.DataTypeConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {
    @Autowired
    private final ItemService itemService;
    @Autowired
    private final DataTypeConversion dataTypeConversion;

    @Autowired
    private RestTemplate restTemplate;

    public ItemController(ItemService itemService, DataTypeConversion dataTypeConversion) {
        this.itemService = itemService;
        this.dataTypeConversion = dataTypeConversion;
    }

    @PostMapping("/saveItem")
    public String saveData(ItemDTO itemDTO){
//        itemService.saveData(dataTypeConversion.getItemEntity(itemDTO));
       return  restTemplate.getForObject("http://localhost:8081/api/v1/user/saveUser",String.class);
    }

    @PostMapping("/saveItem1")
    public ItemDTO saveData1(@RequestBody ItemDTO itemDTO){
//        itemService.saveData(dataTypeConversion.getItemEntity(itemDTO));
        ItemDTO i  = restTemplate.postForObject("http://localhost:8081/api/v1/user/saveUser1", itemDTO, ItemDTO.class);
        System.out.println("item dto : "+i);
        return i;
    }

}
