package com.evergreenprogrammers.microservices.commonnamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CommonNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonNamingServerApplication.class, args);
	}
}
