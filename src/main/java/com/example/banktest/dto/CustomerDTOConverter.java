package com.example.banktest.dto;

import com.example.banktest.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDTOConverter {

    public AccountCustomerDTO convertToAccountCustomer(Customer from){
        if(from==null){
            return new AccountCustomerDTO("","","");
        }
        return new AccountCustomerDTO(from.getId(),from.getName(),from.getSurname());
    }
}
