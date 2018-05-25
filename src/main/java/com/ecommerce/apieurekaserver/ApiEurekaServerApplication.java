package com.ecommerce.apieurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ApiEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiEurekaServerApplication.class, args);
	}
}
