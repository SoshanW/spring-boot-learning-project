package com.iitposs.pos.controller;

import com.iitposs.pos.dto.request.ItemSaveRequestDTO;
import com.iitposs.pos.dto.response.ItemResponseDTO;
import com.iitposs.pos.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = "/get-item-by-id")
    public ItemResponseDTO getItemById(@RequestParam(value = "id") int itemID) {
        return itemService.getItemByID(itemID);
    }

}
