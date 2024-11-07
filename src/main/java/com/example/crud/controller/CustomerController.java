package com.example.crud.controller;

import com.example.crud.dto.CustomerDTO;
import com.example.crud.entity.Customer;
import com.example.crud.service.CustomerService;
import com.example.crud.service.impl.CustomerServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO){
        customerService.saveCustomer(customerDTO);

        return "Saved";
    }


}
