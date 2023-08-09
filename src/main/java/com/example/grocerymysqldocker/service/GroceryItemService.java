package com.example.grocerymysqldocker.service;

import com.example.grocerymysqldocker.entity.GroceryItem;
import com.example.grocerymysqldocker.exception.NotFoundException;
import com.example.grocerymysqldocker.repository.GroceryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroceryItemService {
    @Autowired
    private GroceryItemRepository groceryItemRepository;

    public GroceryItem createGroceryItem(GroceryItem item) {
        return groceryItemRepository.save(item);
    }

    public GroceryItem updateGroceryItem(Long id, GroceryItem updatedItem) {
        GroceryItem existingItem = groceryItemRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Grocery item not found"));

        existingItem.setName(updatedItem.getName());
        existingItem.setPrice(updatedItem.getPrice());

        return groceryItemRepository.save(existingItem);
    }

    public void deleteGroceryItem(Long id) {
        groceryItemRepository.deleteById(id);
    }

    public List<GroceryItem> getAllGroceryItems() {
        return groceryItemRepository.findAll();
    }
}

