package com.iitposs.pos.service;

import com.iitposs.pos.dto.request.ItemSaveRequestDTO;
import com.iitposs.pos.dto.response.ItemResponseDTO;

public interface ItemService {
    String saveItem(ItemSaveRequestDTO itemSaveRequestDTO);

    String updateItem(ItemSaveRequestDTO itemSaveRequestDTO);

    ItemResponseDTO getItemByID(int itemID);
}
