package com.cly.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClient8763Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient8763Application.class, args);
	}
}
