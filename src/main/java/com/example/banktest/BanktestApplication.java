package com.example.banktest;

import com.example.banktest.model.Customer;
import com.example.banktest.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.HashSet;

@ComponentScan({"com.delivery.request"})
@SpringBootApplication
public class BanktestApplication {



	public static void main(String[] args) {
		SpringApplication.run(BanktestApplication.class, args);
	}

}
