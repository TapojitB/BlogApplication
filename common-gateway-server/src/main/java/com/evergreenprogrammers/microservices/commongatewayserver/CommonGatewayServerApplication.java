package com.evergreenprogrammers.microservices.commongatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class CommonGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonGatewayServerApplication.class, args);
	}
}
