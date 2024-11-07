package com.example.crud.dto.request;

public class CustomerUpdateDTO {

    private int customerId;

    private String customerName;

    private String customerEmail;

    private String customerAddress;

    public CustomerUpdateDTO() {
    }

    public CustomerUpdateDTO(int customerId, String customerName, String customerEmail, String customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public CustomerUpdateDTO setCustomerId(int customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getCustomerName() {
        return customerName;
    }

    public CustomerUpdateDTO setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public CustomerUpdateDTO setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public CustomerUpdateDTO setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }

    @Override
    public String toString() {
        return "CustomerUpdateDTO{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}
