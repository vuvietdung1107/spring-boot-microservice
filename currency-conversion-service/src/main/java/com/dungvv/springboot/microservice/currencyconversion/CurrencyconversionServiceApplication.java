package com.dungvv.springboot.microservice.currencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.dungvv.springboot.microservice.currencyconversion")
@EnableDiscoveryClient
public class CurrencyconversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyconversionServiceApplication.class, args);
	}

}
