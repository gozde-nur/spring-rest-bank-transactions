package com.example.banktest.service;

import com.example.banktest.model.Account;
import com.example.banktest.model.Transaction;
import com.example.banktest.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
    protected Transaction initiateMoney(final Account account, BigDecimal amount){
        return transactionRepository.save(
                new Transaction(amount,account)
        );
    }
}
