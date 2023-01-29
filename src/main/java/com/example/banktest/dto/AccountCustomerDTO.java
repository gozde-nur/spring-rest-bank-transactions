package com.example.banktest.dto;

import lombok.Data;
@Data
public class AccountCustomerDTO extends BaseDTO{
    private String name;
    private String surname;

    public AccountCustomerDTO(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public AccountCustomerDTO(String id, String name, String surname) {
        super();
    }
}