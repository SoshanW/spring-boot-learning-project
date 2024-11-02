package com.iitposs.pos.controller;

import com.iitposs.pos.dto.request.ItemSaveRequestDTO;
import com.iitposs.pos.dto.response.CustomerResponseDTO;
import com.iitposs.pos.dto.response.ItemAllDetailsResponseDTO;
import com.iitposs.pos.dto.response.ItemResponseDTO;
import com.iitposs.pos.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping(path = "/save-item")
    public String saveItem(@RequestBody ItemSaveRequestDTO itemSaveRequestDTO) {
       return itemService.saveItem(itemSaveRequestDTO);
    }

    @PutMapping(path = "/update-item")
    public String updateItem(@RequestBody ItemSaveRequestDTO itemSaveRequestDTO) {
        return itemService.updateItem(itemSaveRequestDTO);
    }

    @GetMapping(
            path = "/get-item-by-id",
            params = "id"
    )
    public ItemResponseDTO getItemById(@RequestParam(value = "id") int itemID) {
        return itemService.getItemByID(itemID);
    }

    @GetMapping (path = "/get-all-items")
    public List<ItemResponseDTO> getAllItems() {
        List<ItemResponseDTO> itemResponseDTOList = itemService.getAllItems();
        return itemResponseDTOList;
    }

    @DeleteMapping(path = "/delete-item/{id}")
    public String deleteItemById(@PathVariable(value = "id") int itemID) {
        String message = itemService.deleteItem(itemID);
        return message;
    }

    @GetMapping(
            path = "/get-all-items-by-state",
            params = "state"
    )
    public List<ItemAllDetailsResponseDTO> getAllItemsByState(@RequestParam(value = "state") boolean state) {
        List<ItemAllDetailsResponseDTO> itemAllDetailsResponseDTOS = itemService.getAllItemsByState(state);
        return itemAllDetailsResponseDTOS;
    }

}
