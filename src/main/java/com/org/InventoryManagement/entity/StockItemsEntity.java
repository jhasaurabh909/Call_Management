package com.org.InventoryManagement.entity;

import javax.persistence.*;

@Entity(name = "stock_items")
public class StockItemsEntity {


    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "stock_Items_Id")
    private Integer stockItemsId;

    @Column(name = "Site_Name")
    public String siteName;

    @Column(name = "received_date")
    private String receivedDate;

    @Column(name = "remaining_quantity")
    private Integer remainingQuantity;

    @Column(name = "initial_quantity")
    private Integer initialQuantity;

   @Column(name = "hardware_name")
    private String hardwareName;

    @Column(name = "Doc_No")
    private String docNumber;

    public String getHardwareName() {
        return hardwareName;
    }

    public void setHardwareName(String hardwareName) {
        this.hardwareName = hardwareName;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public Integer getStockItemsId() {
        return stockItemsId;
    }

    public void setStockItemsId(Integer stockItemsId) {
        this.stockItemsId = stockItemsId;
    }

    public String getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(String receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Integer getRemainingQuantity() {
        return remainingQuantity;
    }

    public void setRemainingQuantity(Integer remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }

    public Integer getInitialQuantity() {
        return initialQuantity;
    }

    public void setInitialQuantity(Integer initialQuantity) {
        this.initialQuantity = initialQuantity;
    }



}
