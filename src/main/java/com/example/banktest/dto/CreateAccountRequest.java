package com.example.banktest.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateAccountRequest {
    private String customerId;
    private BigDecimal initialCredit;
}
