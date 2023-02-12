package com.org.InventoryManagement.repository;



import com.org.InventoryManagement.entity.AddEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<AddEmployee, Integer> {
    @Query(value = "select * from emp_details", nativeQuery = true)
    public List<AddEmployee> fetchEmployeeList();
}
