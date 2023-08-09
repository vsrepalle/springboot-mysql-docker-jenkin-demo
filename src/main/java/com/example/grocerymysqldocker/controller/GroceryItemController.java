package com.example.grocerymysqldocker.controller;

import com.example.grocerymysqldocker.entity.GroceryItem;
import com.example.grocerymysqldocker.service.GroceryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/groceries")
public class GroceryItemController {
    @Autowired
    private GroceryItemService groceryItemService;

    @PostMapping
    public ResponseEntity<GroceryItem> createGroceryItem(@RequestBody GroceryItem item) {
        GroceryItem createdItem = groceryItemService.createGroceryItem(item);
        return ResponseEntity.created(URI.create("/groceries/" + createdItem.getId())).body(createdItem);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GroceryItem> updateGroceryItem(@PathVariable Long id, @RequestBody GroceryItem updatedItem) {
        GroceryItem item = groceryItemService.updateGroceryItem(id, updatedItem);
        return ResponseEntity.ok(item);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGroceryItem(@PathVariable Long id) {
        groceryItemService.deleteGroceryItem(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<GroceryItem>> getAllGroceryItems() {
        List<GroceryItem> items = groceryItemService.getAllGroceryItems();
        return ResponseEntity.ok(items);
    }
}

