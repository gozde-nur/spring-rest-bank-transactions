package com.example.banktest.controller;

import com.example.banktest.dto.CustomerDTO;
import com.example.banktest.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/customer")
public class CustomerContoroller {

    private final CustomerService customerService;

    public CustomerContoroller(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable String customerId){
        return (ResponseEntity<CustomerDTO>) ResponseEntity.ok();
    }

    @GetMapping
    public ResponseEntity<List<CustomerDTO>> getAllCustomers() {
        return (ResponseEntity<List<CustomerDTO>>) ResponseEntity.ok();
    }

}
