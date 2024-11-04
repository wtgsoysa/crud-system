package com.example.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "customer_id" , length = 10)
    private int customerId;

    @Column(name = "customer_name" , length = 50)
    private String customerName;

    @Column(name = "customer_mail" , length = 50)
    private String customerEmail;

    @Column(name = "customer_address" , length = 50)
    private String customerAddress;

    @Column(name = "customer_nic" , length = 50)
    private String customerNic;

    @Column(name = "customer_number" , length = 50)
    private int customerNumber;

    @Column(name = "customer_active" )
    private boolean customerActive;

    public Customer() {
    }

    public Customer(int customerId, String customerName, String customerEmail, String customerAddress, String customerNic, int customerNumber, boolean customerActive) {
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
        return "Customer{" +
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
