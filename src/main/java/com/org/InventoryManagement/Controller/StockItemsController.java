package com.org.InventoryManagement.Controller;

import com.org.InventoryManagement.entity.AssignedItems;
import com.org.InventoryManagement.entity.StockItemsEntity;
import com.org.InventoryManagement.entity.Store;
import com.org.InventoryManagement.repository.StockItemsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StockItemsController {

    @Autowired
    StockItemsInterface stockItemsInterface;

    @RequestMapping(path = "/fetchStockItems",method = RequestMethod.GET)
    public @ResponseBody List<StockItemsEntity> fetchInventoryDetails(){
        return stockItemsInterface.fetchStockItemsDetails();
    }

    @RequestMapping(path = "/addNewStock",method = RequestMethod.POST)
    public ModelAndView fetchInventoryDetails(@ModelAttribute StockItemsEntity stockItems){
        ModelAndView mav = new ModelAndView("unusedinventory");
        stockItems.setRemainingQuantity(stockItems.getInitialQuantity());
        stockItemsInterface.save(stockItems);
        List<StockItemsEntity> stockItemsList = stockItemsInterface.fetchStockItemsDetails();
        mav.addObject(stockItemsList);
        return mav;
    }


}
