package com.Microservices.HotelMservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HotelMserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelMserviceApplication.class, args);
	}

}
