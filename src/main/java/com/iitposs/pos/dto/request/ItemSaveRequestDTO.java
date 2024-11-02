package com.iitposs.pos.dto.request;

import com.iitposs.pos.util.enums.MeasuringType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemSaveRequestDTO {

    private int item_id;
    private String itemName;
    private MeasuringType measuringType;
    private double supplierPrice;
    private double displayPrice;
    private double sellingPrice;
    private int qtyOnHand;
    private boolean activeState;

}
