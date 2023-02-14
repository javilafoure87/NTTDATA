package com.nttdata.bankcredit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BankCreditsApplication {

	public static void main(String[] args) {

		SpringApplication.run(BankCreditsApplication.class, args);
	}

}
