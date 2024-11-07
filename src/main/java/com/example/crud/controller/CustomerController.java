package com.example.crud.controller;

import com.example.crud.dto.CustomerDTO;
import com.example.crud.dto.request.CustomerUpdateDTO;
import com.example.crud.entity.Customer;
import com.example.crud.service.CustomerService;
import com.example.crud.service.impl.CustomerServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //Create method to response
    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.saveCustomer(customerDTO);
        return "Data saved successfully";
    }

    @PutMapping("/update")
    public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO) {
        customerService.updateCustomer(customerUpdateDTO);
        return "Data updated successfully";

    }



}
