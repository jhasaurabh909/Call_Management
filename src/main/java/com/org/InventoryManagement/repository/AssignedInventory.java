package com.org.InventoryManagement.repository;

import com.org.InventoryManagement.entity.AssignedItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssignedInventory extends JpaRepository<AssignedItems,String> {
    @Query(value = "select * from assigned_items",nativeQuery = true)
    public List<AssignedItems> fetchAssignedItems();

    @Query(value = "select * from assigned_items where hw_name = :hardwareName",nativeQuery = true)
    public List<AssignedItems> fetchHardwareAssignedItems(@Param("hardwareName") String hardwareName);

}
