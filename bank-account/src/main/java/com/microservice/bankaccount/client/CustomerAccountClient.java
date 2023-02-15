package com.microservice.bankaccount.client;


import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name="bank-customer")
public interface CustomerAccountClient {

}
