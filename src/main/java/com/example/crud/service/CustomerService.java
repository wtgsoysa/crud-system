package com.example.crud.service;

import com.example.crud.dto.CustomerDTO;
import com.example.crud.dto.request.CustomerUpdateDTO;

import java.util.List;


public interface CustomerService {
    public String saveCustomer(CustomerDTO customer);

    String updateCustomer(CustomerUpdateDTO customerUpdateDTO);


    List<CustomerDTO> getAllCustomers();
}
