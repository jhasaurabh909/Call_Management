package com.org.InventoryManagement.Controller;

import com.org.InventoryManagement.entity.AssignedItems;
import com.org.InventoryManagement.entity.StockItemsEntity;
import com.org.InventoryManagement.repository.AssignedInventory;
import com.org.InventoryManagement.repository.StockItemsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AssignedItemsController {
    @Autowired
    AssignedInventory assignedInventory;

    @Autowired
    StockItemsInterface stockItemsInterface;

    @RequestMapping(path = "/assign",method = RequestMethod.POST)
    public String fetchAssignedItems(@ModelAttribute AssignedItems assignedItems){
        try{
            String hardwareName = assignedItems.getHardwareName();
            assignedInventory.save(assignedItems);
            List<StockItemsEntity> stockItemsList = stockItemsInterface.fetchStockItemsDetails();
            for(StockItemsEntity stockItems : stockItemsList){
                if(stockItems.getHardwareName().equalsIgnoreCase(hardwareName)){
                    if(stockItems.getRemainingQuantity() > 0){
                        stockItems.setRemainingQuantity(stockItems.getRemainingQuantity()-1);
                        stockItemsInterface.save(stockItems);
                        break;
                    }
                }
            }
        }catch (Exception ex){
            System.out.println("Error while assigning a item : "+ex.getMessage());
        }
        return "usedinventory";
    }
}
