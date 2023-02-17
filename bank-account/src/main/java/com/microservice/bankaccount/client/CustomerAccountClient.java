package com.microservice.bankaccount.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//using feign client to connect to customer microservice
@FeignClient(name = "bank-customer")
public interface CustomerAccountClient {
    //method that returns a boolean response if there is a customer with ID
    // in the query to the bank-customer microservice
    @RequestMapping("/client/{dni}")
    boolean customerAvailable(@PathVariable Integer dni);
}
