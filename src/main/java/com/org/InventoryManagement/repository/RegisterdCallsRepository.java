package com.org.InventoryManagement.repository;

import com.org.InventoryManagement.entity.RegisteredCallsEntity;
import com.org.InventoryManagement.entity.StockItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegisterdCallsRepository extends JpaRepository<RegisteredCallsEntity,Integer> {

    @Query(value = "select * from register_call",nativeQuery = true)
    public List<RegisteredCallsEntity> fetchRegisterdCallsDetails();

}
