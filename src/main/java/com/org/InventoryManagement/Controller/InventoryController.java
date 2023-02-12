package com.org.InventoryManagement.Controller;
import com.org.InventoryManagement.entity.AddEmployee;
import com.org.InventoryManagement.entity.AssignedItems;
import com.org.InventoryManagement.entity.StockItemsEntity;
import com.org.InventoryManagement.entity.Store;
import com.org.InventoryManagement.models.HardwareModel;
import com.org.InventoryManagement.repository.AssignedInventory;
import com.org.InventoryManagement.repository.EmployeeRepository;
import com.org.InventoryManagement.repository.InventoryRepository;
import com.org.InventoryManagement.service.HardwareDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class InventoryController {

    @Autowired
    InventoryRepository inventoryRepository;
    @Autowired
    AssignedInventory assignedInventory;
    @Autowired
    HardwareDetailsService hardwareDetailsService;

    @Autowired
    EmployeeRepository employeeRepository;

    Boolean pathFromCountPage = false;
    @RequestMapping(path = "/hardware-list",method = RequestMethod.GET)
    public @ResponseBody List<HardwareModel> fetchHardwareAndQuantityDetails(){
        return hardwareDetailsService.fetchHardwareAndQuantity();
    }

    @RequestMapping(path = "/usedinventory/{hardwareName}",method = RequestMethod.GET)
    public ModelAndView fetchHardwareAssignedItems(@PathVariable("hardwareName") String hardwareName){
        ModelAndView mav = new ModelAndView("hardware-usedInventory.html");
        mav.addObject("message","Ravi");
        return mav;

    }

    @RequestMapping(path = "/fetch",method = RequestMethod.GET)
    public @ResponseBody List<Store> fetchInventoryDetails(){
        return inventoryRepository.fetchStoreDetails();
    }

    @RequestMapping(path = "/getAssignedItems",method = RequestMethod.GET)
    public @ResponseBody List<AssignedItems> fetchAssignedItems(){
        return assignedInventory.fetchAssignedItems();
    }

    @RequestMapping(path = "/home",method = RequestMethod.GET)
    public  String homePage(){
        return "home";
    }

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String indexPage(){
        return "index";
    }

    @RequestMapping(path = "/totalinventory", method = RequestMethod.GET)
    public String totalinventoryPage(){
        return "totalinventory";
    }

    @RequestMapping(path = "/usedinventory", method = RequestMethod.GET)
    public String usedinventoryPage(){
        return "usedinventory";
    }

    @RequestMapping(path = "/unusedinventory", method = RequestMethod.GET)
    public String unusedInventoryPage(){
        return "unusedinventory";
    }

    @RequestMapping(path = "/assign-item", method = RequestMethod.GET)
    public String assignItem(){
        return "assign-item";
    }

    @RequestMapping(path = "/add-item", method = RequestMethod.GET)
    public String addItem(){
        return "add-item";
    }

    @RequestMapping(path = "/Filter-call",method = RequestMethod.GET)
    public  String filterPage(){
        return "Filter-call";
    }


@RequestMapping(path = "/index1", method = RequestMethod.GET)
public String index(){
        return "index1";
}
    @RequestMapping(path = "/employeedetails", method = RequestMethod.POST)
    public ModelAndView fetchEmployee(@ModelAttribute AddEmployee addEmployee){
        ModelAndView mav = new ModelAndView("view-employee");
        mav.addObject(addEmployee);
        employeeRepository.save(addEmployee);
        return mav;
    }

    @RequestMapping(path = "/fetch-employee",method = RequestMethod.GET)
    public @ResponseBody List<AddEmployee> fetchEmployeeDetails(){
        List <AddEmployee> employeeList =  employeeRepository.fetchEmployeeList();
        return employeeList;
    }

}
