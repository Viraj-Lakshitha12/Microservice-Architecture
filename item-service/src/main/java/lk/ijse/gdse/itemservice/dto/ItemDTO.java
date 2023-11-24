package lk.ijse.gdse.itemservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemDTO {
    private String itemId;
    private String itemName;
    private String unitPrice;
    private String qty;

//    private String id;
//    private String name;
//    private String address;
//    private String salary;
}
