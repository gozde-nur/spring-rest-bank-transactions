package com.example.banktest.dto;

import com.example.banktest.model.TransactionType;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDTO extends BaseDTO{
    private TransactionType transactionType= TransactionType.INITIAL;
    private BigDecimal amount;
    private LocalDateTime transactionDate;

}
