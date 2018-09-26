package com.evergreenprogrammers.microservices.shapeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableFeignClients(basePackages="com.evergreenprogrammers.microservices.shapeservice.proxy")
@EnableDiscoveryClient(autoRegister=true)
public class ShapeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShapeServiceApplication.class, args);
	}
	
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;

	}

}
