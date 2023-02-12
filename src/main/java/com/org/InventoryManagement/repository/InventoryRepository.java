package com.org.InventoryManagement.repository;

import com.org.InventoryManagement.entity.AssignedItems;
import com.org.InventoryManagement.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Store,Integer>{

    @Query(value = "select * from stock_items",nativeQuery = true)
    public List<Store> fetchStoreDetails();

    @Query(value = "select distinct hardwrae_name from hardware",nativeQuery = true)
    public List<String> fetchAllHardwares();

    @Query(value = "select count(*) from register_call where hw_name  = :hardwareName ",nativeQuery = true)
    public int fetchhardwareAssignedQuantity(@Param("hardwareName") String hardwareName);

    @Query(value = "select count(*) from stock_items where hardware_name  = :hardwareName ",nativeQuery = true)
    public int fetchhardwareStockQuantity(@Param("hardwareName") String hardwareName);


}
