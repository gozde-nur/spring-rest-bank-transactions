package com.example.banktest.dto;

import com.example.banktest.model.Transaction;

public class TransactionDtoConverter {

    public TransactionDtoConverter() {
    }

    public Transaction convert(Transaction from){
        return new Transaction(from.getId(),
                from.getTransactionType(),
                from.getTransactionDate(),
                from.getAmount());

    }
}
