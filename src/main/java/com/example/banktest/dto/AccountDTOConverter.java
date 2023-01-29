package com.example.banktest.dto;

import com.example.banktest.model.Account;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.stream.Collectors;


public class AccountDTOConverter {

    private final CustomerDTOConverter customerDTOConverter;
    private final TransactionDtoConverter transactionDTOConverter;

    public AccountDTOConverter(CustomerDTOConverter customerDTOConverter
            ,TransactionDtoConverter transactionDTOConverter) {
        this.customerDTOConverter= customerDTOConverter;
        this.transactionDTOConverter=transactionDTOConverter;
    }

    public AccountDTO  convert(Account from){
        return new AccountDTO(from.getId(),
                from.getBalance(),
                from.getCreationDate(),
                customerDTOConverter.convertToAccountCustomer(from.getCustomer()),
                Objects.requireNonNull(from.getTransactions())
                        .stream()
                        .map(transactionDTOConverter::convert)
                        .collect(Collectors.toSet()));
    }
}
