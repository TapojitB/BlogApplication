package com.evergreenprogrammers.microservices.shapeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages="com.evergreenprogrammers.microservices.shapeservice.proxy")
@EnableDiscoveryClient(autoRegister=true)
public class ShapeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShapeServiceApplication.class, args);
	}
}
