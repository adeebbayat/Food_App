package com.adeebbayat.server.services;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.adeebbayat.server.models.Item;
import com.adeebbayat.server.repositories.ItemRepository;


@Service
public class ItemService {
    
    private final ItemRepository itemRepository;

    // ?
    public ItemService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    // Create Item
    public Item addItem(Item item){
        return itemRepository.save(item);
    }

    // Find All
    public List<Item> allItems(){
        return itemRepository.findAll();
    }

    // Find One Item
    public Item findItem(Long id){
        Optional<Item> optionalItem = itemRepository.findById(id);
        if(optionalItem.isPresent()){
            return optionalItem.get();
        }
        return null;
    }

    // Update Item
    public Item updateItem(Item item){
        return itemRepository.save(item);
    }

    // Delete Item
    public void deleteItem(Long id){
        itemRepository.deleteById(id);
    }


}

