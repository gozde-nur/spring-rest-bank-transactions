package com.example.banktest.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO extends BaseDTO{
    private BigDecimal balance;
    private LocalDateTime creationDate;
    private AccountCustomerDTO customer;
    private Set<TransactionDTO> transactionDTOSet;

    public <R> AccountDTO(String id, BigDecimal balance, LocalDateTime creationDate, AccountCustomerDTO convertToAccountCustomer, R collect) {
        super();
    }
}
