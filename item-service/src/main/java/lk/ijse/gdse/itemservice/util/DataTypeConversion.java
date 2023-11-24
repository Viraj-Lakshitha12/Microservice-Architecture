package lk.ijse.gdse.itemservice.util;
import lk.ijse.gdse.itemservice.dto.ItemDTO;
import lk.ijse.gdse.itemservice.entity.Item;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataTypeConversion {
    @Autowired
    private final ModelMapper modelMapper;

    public DataTypeConversion(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ItemDTO getItemDTO(Item user){
        return modelMapper.map(user, ItemDTO.class);
    }
    public Item getItemEntity(ItemDTO itemDTO){
        return modelMapper.map(itemDTO, Item.class);
    }
}
