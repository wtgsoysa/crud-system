package com.example.crud.dto;

import jakarta.persistence.Column;

public class CustomerDTO {

    private int customerId;

    private String customerName;

    private String customerEmail;

    private String customerAddress;

    private String customerNic;

    private int customerNumber;

    private boolean customerActive;

    public CustomerDTO() {
    }

    public CustomerDTO(int customerId, String customerName, String customerEmail, String customerAddress, String customerNic, int customerNumber, boolean customerActive) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.customerNic = customerNic;
        this.customerNumber = customerNumber;
        this.customerActive = customerActive;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerNic() {
        return customerNic;
    }

    public void setCustomerNic(String customerNic) {
        this.customerNic = customerNic;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isCustomerActive() {
        return customerActive;
    }

    public void setCustomerActive(boolean customerActive) {
        this.customerActive = customerActive;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerNic='" + customerNic + '\'' +
                ", customerNumber=" + customerNumber +
                ", customerActive=" + customerActive +
                '}';
    }
}

