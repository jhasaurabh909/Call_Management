package com.org.InventoryManagement.entity;


import javax.persistence.*;

@Entity(name = "register_call")
public class RegisteredCallsEntity {


    @Column(name = "Call_Id")
    int callId;


    @Id
    @GeneratedValue (strategy =  GenerationType.AUTO)
    @Column(name ="Call_Detail_Id")
   Integer callDetailId;

    @Column(name ="User_Name")
    String userName;


    @Column(name ="response_time")
    String response;

    @Column(name="Department")
    String department;

    @Column(name ="Prblm_Details")
    String prblmDetails;

    @Column(name="Asset_Number")
    String assetNumber;

    @Column(name = "Closing_Mode")
    String closingMode;

    @Column(name = "Closing_Time")
    String closingTime;

    @Column(name="By_Engg")
    String byEngg;

    @Column(name="Call_Date")
    String callDate;


    @Column(name = "Status")
    String status;

    @Column(name = "Call_Cat")
    String callCat;

    @Column(name = "Call_Sub_Cat")
    String callSubCat;

    @Column(name = "Call_Type")
    String callType;

    @Column(name="Content")
    String content;

    @Column(name = "Hardware_Used")
    String hardwareUsed;

    @Column(name="Inventory_No")
    String inventoryNumber;
    @Column(name="HW_name")
    String hardwareName;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPrblmDetails() {
        return prblmDetails;
    }

    public void setPrblmDetails(String prblmDetails) {
        this.prblmDetails = prblmDetails;
    }

    public String getClosingMode() {
        return closingMode;
    }

    public void setClosingMode(String closingMode) {
        this.closingMode = closingMode;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCallCat() {
        return callCat;
    }

    public void setCallCat(String callCat) {
        this.callCat = callCat;
    }

    public String getCallSubCat() {
        return callSubCat;
    }

    public void setCallSubCat(String callSubCat) {
        this.callSubCat = callSubCat;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public String getHadwareUsed() {
        return hardwareUsed;
    }

    public void setHadwareUsed(String hadwareUsed) {
        this.hardwareUsed = hadwareUsed;
    }

    public String getHardwareName() {
        return hardwareName;
    }

    public void setHardwareName(String hardwareName) {
        this.hardwareName = hardwareName;
    }

    public String getAssetNumber() {
        return assetNumber;
    }

    public void setAssetNumber(String assetNumber) {
        this.assetNumber = assetNumber;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getDepartment() {
        return department;
    }

    public Integer getCallDetailId() {
        return callDetailId;
    }

    public void setCallDetailId(Integer callDetailId) {
        this.callDetailId = callDetailId;
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
    public int getCallId() {
        return callId;
    }

    public void setCallId(int callId) {
        this.callId = callId;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getCallDate() {
        return callDate;
    }

    public void setCallDate(String callDate) {
        this.callDate = callDate;
    }



    public String getHardwareUsed() {
        return hardwareUsed;
    }

    public void setHardwareUsed(String hardwareUsed) {
        this.hardwareUsed = hardwareUsed;
    }
}
