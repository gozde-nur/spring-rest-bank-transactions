package com.example.banktest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Transaction extends BaseEntity{
    private TransactionType transactionType= TransactionType.INITIAL;
    private BigDecimal amount;
    private LocalDateTime transactionDate;

    @ManyToOne(fetch = FetchType.LAZY ,optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    public Transaction(String id, TransactionType transactionType, LocalDateTime transactionDate, BigDecimal amount) {
        super();
    }

    public Transaction(BigDecimal amount, Account account) {
        super();
    }

    public Transaction(BigDecimal initialCredit, LocalDateTime now, Account account) {
        super();
    }
}
