package com.example.crud.service.impl;

import com.example.crud.dto.CustomerDTO;
import com.example.crud.dto.request.CustomerUpdateDTO;
import com.example.crud.entity.Customer;
import com.example.crud.repo.CustomerRepo;
import com.example.crud.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;


    @Override
    public String updateCustomer(CustomerUpdateDTO customerUpdateDTO) {
        if (customerRepo.existsById(customerUpdateDTO.getCustomerId())) {
            Customer customer = customerRepo.getReferenceById(customerUpdateDTO.getCustomerId());
            customer.setCustomerName(customerUpdateDTO.getCustomerName());
            customer.setCustomerEmail(customerUpdateDTO.getCustomerEmail());
            customer.setCustomerAddress(customerUpdateDTO.getCustomerAddress());



            customerRepo.save(customer);
            return customerUpdateDTO.getCustomerName() + "Updated Successfully";

        } else {
            throw new RuntimeException("no data found for that id");
        }

    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> getAllCustomers = customerRepo.findAll();

        List<CustomerDTO> customerDTOList = new ArrayList<>();

        for(Customer customer : getAllCustomers){
            CustomerDTO customerDTO = new CustomerDTO(
                    customer.getCustomerId(),
                    customer.getCustomerName(),
                    customer.getCustomerEmail(),
                    customer.getCustomerAddress(),
                    customer.getCustomerNic(),
                    customer.getCustomerNumber(),
                    customer.isCustomerActive()
            );
            customerDTOList.add(customerDTO);
        }
        return customerDTOList;
    }


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
