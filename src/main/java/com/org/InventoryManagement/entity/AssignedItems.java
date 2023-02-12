package com.org.InventoryManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AssignedItems {

    @Column(name="HW_name")
    String hardwareName;

    @Column(name="Asset_Number")
    String assetNumber;

    @Id
    @Column(name="Inventory_No")
    String inventoryNumber;

    @Column(name="m_date")
    String mDate;

    @Column(name="Department")
    String department;

    @Column(name="By_Engg")
    String byEngg;

    @Column(name="content")
    String content;


    public String getHardwareName() {
        return hardwareName;
    }

    public void setHardwareName(String hardwareName) {
        this.hardwareName = hardwareName;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getByEngg() {
        return byEngg;
    }

    public void setByEngg(String byEngg) {
        this.byEngg = byEngg;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAssetNumber() {
        return assetNumber;
    }

    public void setAssetNumber(String assetNumber) {
        this.assetNumber = assetNumber;
    }
}
