package com.evergreenprogrammers.microservices.dimensionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient(autoRegister=true)
public class DimensionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DimensionServiceApplication.class, args);
	}
}
