package com.org.InventoryManagement.repository;


import com.org.InventoryManagement.entity.StockItemsEntity;
import com.org.InventoryManagement.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockItemsInterface extends JpaRepository<StockItemsEntity, String> {

    @Query(value = "select * from stock_items",nativeQuery = true)
    public List<StockItemsEntity> fetchStockItemsDetails();
}
