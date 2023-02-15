package com.microservice.bankaccount.client;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="bank-customer")
public interface CustomerAccountClient {

    @RequestMapping("/client/{dni}")
    boolean customerAvailable(@PathVariable Integer dni);
}
