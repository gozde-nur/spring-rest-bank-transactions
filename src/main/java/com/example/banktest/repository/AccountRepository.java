package com.example.banktest.repository;

import com.example.banktest.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,String>{
}
