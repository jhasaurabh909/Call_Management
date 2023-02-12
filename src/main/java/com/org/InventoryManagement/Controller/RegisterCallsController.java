package com.org.InventoryManagement.Controller;

import com.org.InventoryManagement.entity.RegisteredCallsEntity;
import com.org.InventoryManagement.entity.StockItemsEntity;
import com.org.InventoryManagement.repository.RegisterdCallsRepository;
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
public class RegisterCallsController {
    @Autowired
    RegisterdCallsRepository registerdCallsRepository;
    @Autowired
    StockItemsInterface stockItemsInterface;


    @RequestMapping(path = "/callDetails", method = RequestMethod.GET)
    public ModelAndView callDetailsPage(){
        ModelAndView mav = new ModelAndView("call-details");
        return mav;
    }

//    @RequestMapping(path = "/addNewCall", method = RequestMethod.GET)
//    public String addNewCall(){
//        return "call-details";
//    }

    @RequestMapping(path = "/addcall",method = RequestMethod.POST)
    public ModelAndView saveCallDetails(@ModelAttribute RegisteredCallsEntity registerdcallsentity){
        ModelAndView mav = new ModelAndView("call-history");
        mav.addObject("RegisteredCallsEntity", registerdcallsentity);
        try{
            String hardwareName = registerdcallsentity.getHardwareName();
            registerdCallsRepository.save(registerdcallsentity);
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

        return mav;
}
    @RequestMapping(path = "/fetch-calls",method = RequestMethod.GET)
    public @ResponseBody List<RegisteredCallsEntity> fetchCallDetails(){
     List<RegisteredCallsEntity> calllist =  registerdCallsRepository.fetchRegisterdCallsDetails();
     return calllist;
}

    @RequestMapping(path = "/call-history", method = RequestMethod.GET)
    public ModelAndView callHistoryPage(){
        ModelAndView mav = new ModelAndView("call-history");
        return mav;
    }

    }