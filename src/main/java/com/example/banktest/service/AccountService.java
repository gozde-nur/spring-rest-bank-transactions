package com.example.banktest.service;

import com.example.banktest.dto.AccountDTO;
import com.example.banktest.dto.AccountDTOConverter;
import com.example.banktest.dto.CreateAccountRequest;
import com.example.banktest.model.Account;
import com.example.banktest.model.Customer;
import com.example.banktest.model.Transaction;
import com.example.banktest.repository.AccountRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private TransactionService transactionService;
    @Autowired
    private AccountDTOConverter converter;

    private Clock clock;



    public AccountDTO createAccount(CreateAccountRequest createAccountRequest){
        Customer customer = customerService.findCustomerById(createAccountRequest.getCustomerId());

        Account account = new Account(
                createAccountRequest.getInitialCredit(),
                LocalDateTime.now(),
                customer);


        if (createAccountRequest.getInitialCredit().compareTo(BigDecimal.ZERO) > 0) {
            Transaction transaction = new Transaction(
                    createAccountRequest.getInitialCredit(),
                    getLocalDateTimeNow(),
                    account);

            account.getTransactions().add(transaction);
        }
        return converter.convert(accountRepository.save(account));
    }
    private LocalDateTime getLocalDateTimeNow() {
        Instant instant = clock.instant();
        return LocalDateTime.ofInstant(
                instant,
                Clock.systemDefaultZone().getZone());
    }

}
