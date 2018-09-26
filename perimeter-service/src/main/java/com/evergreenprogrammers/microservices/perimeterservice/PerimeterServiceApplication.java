package com.evergreenprogrammers.microservices.perimeterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient(autoRegister=true)
public class PerimeterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PerimeterServiceApplication.class, args);
	}
}
