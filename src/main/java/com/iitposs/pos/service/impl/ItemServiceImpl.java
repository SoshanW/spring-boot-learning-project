package com.iitposs.pos.service.impl;

import com.iitposs.pos.dto.request.ItemSaveRequestDTO;
import com.iitposs.pos.dto.response.ItemResponseDTO;
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
                itemSaveRequestDTO.getItemID(),
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
        if (itemRepo.existsById(itemSaveRequestDTO.getItemID())) {

            Item item = itemRepo.getOne(itemSaveRequestDTO.getItemID());
            item.setItemName(itemSaveRequestDTO.getItemName());
            item.setMeasuringType(itemSaveRequestDTO.getMeasuringType());
            item.setSupplierPrice(itemSaveRequestDTO.getSupplierPrice());
            item.setDisplayPrice(itemSaveRequestDTO.getDisplayPrice());
            item.setSellingPrice(itemSaveRequestDTO.getSellingPrice());
            item.setQtyOnHand(itemSaveRequestDTO.getQtyOnHand());
            item.setActiveState(itemSaveRequestDTO.isActiveState());
            itemRepo.save(item);
            return "Item Updated";

        }else {
            return "Item Not Found";
        }
    }

    @Override
    public ItemResponseDTO getItemByID(int itemID) {
        if (itemRepo.existsById(itemID)) {
            Item item = itemRepo.getReferenceById(itemID);

            return new ItemResponseDTO(
                    item.getItemID(),
                    item.getItemName(),
                    item.getMeasuringType(),
                    item.getSupplierPrice(),
                    item.getDisplayPrice(),
                    item.getSellingPrice(),
                    item.getQtyOnHand(),
                    item.isActiveState()
            );

        }return null;
    }
}
