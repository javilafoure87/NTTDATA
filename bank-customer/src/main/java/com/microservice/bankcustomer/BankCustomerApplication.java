package com.microservice.bankcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BankCustomerApplication {

	public static void main(String[] args) {

		SpringApplication.run(BankCustomerApplication.class, args);
	}

}
