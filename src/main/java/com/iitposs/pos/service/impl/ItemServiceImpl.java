package com.iitposs.pos.service.impl;

import com.iitposs.pos.dto.request.ItemSaveRequestDTO;
import com.iitposs.pos.entity.Item;
import com.iitposs.pos.repo.ItemRepo;
import com.iitposs.pos.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepo itemRepo;

    @Override
    public String saveItem(ItemSaveRequestDTO itemSaveRequestDTO) {

        Item item = new Item(
                itemSaveRequestDTO.getItem_id(),
                itemSaveRequestDTO.getItemName(),
                itemSaveRequestDTO.getMeasuringType(),
                itemSaveRequestDTO.getSupplierPrice(),
                itemSaveRequestDTO.getDisplayPrice(),
                itemSaveRequestDTO.getSellingPrice(),
                itemSaveRequestDTO.getQtyOnHand(),
                itemSaveRequestDTO.isActiveState()
        );

        itemRepo.save(item);
        return "Item Saved";
    }

    @Override
    public String updateItem(ItemSaveRequestDTO itemSaveRequestDTO) {
        Item item = new Item(
                itemSaveRequestDTO.getItem_id(),
                itemSaveRequestDTO.getItemName(),
                itemSaveRequestDTO.getMeasuringType(),
                itemSaveRequestDTO.getSupplierPrice(),
                itemSaveRequestDTO.getDisplayPrice(),
                itemSaveRequestDTO.getSellingPrice(),
                itemSaveRequestDTO.getQtyOnHand(),
                itemSaveRequestDTO.isActiveState()
        );

        itemRepo.save(item);
        return "Item Updated";
    }
}
