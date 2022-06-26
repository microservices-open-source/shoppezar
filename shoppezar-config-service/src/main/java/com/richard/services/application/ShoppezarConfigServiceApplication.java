package com.richard.services.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ShoppezarConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppezarConfigServiceApplication.class, args);
	}

}
