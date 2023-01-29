package com.example.banktest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO extends BaseDTO{
    private String name;
    private String surname;
    private Set<CustomerAccountDTO> accountDTOSet;

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", accountDTO=" + accountDTOSet +
                '}';
    }
}
