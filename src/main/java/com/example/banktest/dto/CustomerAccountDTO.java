package com.example.banktest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerAccountDTO extends BaseDTO{
    private BigDecimal balance= BigDecimal.ZERO;
    private Set<TransactionDTO> transactionDTOS;
    private LocalDateTime creationDate;

    @Override
    public String toString() {
        return "CustomerAccountDTO{" +
                "balance=" + balance +
                ", transactionDTOS=" + transactionDTOS +
                ", creationDate=" + creationDate +
                '}';
    }
}
