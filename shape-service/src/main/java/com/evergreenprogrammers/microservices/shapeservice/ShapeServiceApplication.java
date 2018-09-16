package com.evergreenprogrammers.microservices.shapeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages="com.evergreenprogrammers.microservices.shapeservice.proxy")
public class ShapeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShapeServiceApplication.class, args);
	}
}
