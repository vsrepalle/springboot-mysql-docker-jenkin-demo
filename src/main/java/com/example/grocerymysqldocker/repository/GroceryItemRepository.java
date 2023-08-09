package com.example.grocerymysqldocker.repository;

import com.example.grocerymysqldocker.entity.GroceryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long> {
}

