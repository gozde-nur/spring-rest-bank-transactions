package com.example.banktest.service;

import com.example.banktest.dto.AccountCustomerDTO;
import com.example.banktest.dto.CustomerDTOConverter;
import com.example.banktest.exception.CustomerNotFoundException;
import com.example.banktest.model.Customer;
import com.example.banktest.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerDTOConverter converter;

    public CustomerService(CustomerRepository customerRepository, CustomerDTOConverter converter) {
        this.customerRepository = customerRepository;
        this.converter = converter;
    }
    protected Customer findCustomerById(String id){
        return customerRepository.findById(id)
                .orElseThrow(()-> new CustomerNotFoundException("Customer could not find by id :"+ id));
    }

    public AccountCustomerDTO getCustomerById(String customerId) {

        return converter.convertToAccountCustomer(findCustomerById(customerId));
    }

    public List<AccountCustomerDTO> getAllCustomer() {

        return customerRepository.findAll()
                .stream()
                .map(converter::convertToAccountCustomer)
                .collect(Collectors.toList());
    }
}
