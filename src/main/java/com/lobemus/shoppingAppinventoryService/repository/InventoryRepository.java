package com.lobemus.shoppingAppinventoryService.repository;

import com.lobemus.shoppingAppinventoryService.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}
