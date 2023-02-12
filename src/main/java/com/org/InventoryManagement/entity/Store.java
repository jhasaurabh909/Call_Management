package com.org.InventoryManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Store {


    @Column(name="Hardware_name")
    String hardwareName;

    @Column(name="Received_date")
    String receiveddate;

    @Column(name="Doc_No")
    String docNumber;

    @Column(name="remaining_quantity")
    String remainingquantity;

    @Id
    @Column(name="initial_quantity")
    Integer initialquantity;




    public Integer getInitialquantity() {
        return initialquantity;
    }

    public void setInitialquantity(Integer initialquantity) {
        this.initialquantity = initialquantity;
    }

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

    public String getReceiveddate() {
        return receiveddate;
    }

    public void setReceiveddate(String receiveddate) {
        this.receiveddate = receiveddate;
    }

    public String getRemainingquantity() {
        return remainingquantity;
    }

    public void setRemainingquantity(String remainingquantity) {
        this.remainingquantity = remainingquantity;
    }




}
