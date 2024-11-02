package com.iitposs.pos.service;

import com.iitposs.pos.dto.request.ItemSaveRequestDTO;
import com.iitposs.pos.dto.response.ItemAllDetailsResponseDTO;
import com.iitposs.pos.dto.response.ItemResponseDTO;

import java.util.List;

public interface ItemService {
    String saveItem(ItemSaveRequestDTO itemSaveRequestDTO);

    String updateItem(ItemSaveRequestDTO itemSaveRequestDTO);

    ItemResponseDTO getItemByID(int itemID);

    List<ItemResponseDTO> getAllItems();

    String deleteItem(int itemID);

    List<ItemAllDetailsResponseDTO> getAllItemsByState(boolean state);
}
