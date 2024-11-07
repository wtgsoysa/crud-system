package com.example.crud.service.impl;

import com.example.crud.dto.CustomerDTO;
import com.example.crud.entity.Customer;
import com.example.crud.repo.CustomerRepo;
import com.example.crud.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;


    @Override
    public String saveCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(
                customerDTO.getCustomerId(),
                customerDTO.getCustomerName(),
                customerDTO.getCustomerEmail(),
                customerDTO.getCustomerAddress(),
                customerDTO.getCustomerNic(),
                customerDTO.getCustomerNumber(),
                customerDTO.isCustomerActive()
        );
        customerRepo.save(customer);
        return customerDTO.getCustomerAddress();
    }
}
