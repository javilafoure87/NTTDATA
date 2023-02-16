package com.microservice.bankaccount.client;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="bank-customer")
public interface CustomerAccountClient {

    //@Bean
    @RequestMapping("/client/{dni}")
    boolean customerAvailable(@PathVariable Integer dni);
}
