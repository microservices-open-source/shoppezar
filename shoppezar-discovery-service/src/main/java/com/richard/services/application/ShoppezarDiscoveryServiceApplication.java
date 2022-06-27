package com.richard.services.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ShoppezarDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppezarDiscoveryServiceApplication.class, args);
	}

}
