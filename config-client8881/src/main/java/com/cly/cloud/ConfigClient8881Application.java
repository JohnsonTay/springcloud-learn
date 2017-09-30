package com.cly.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClient8881Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClient8881Application.class, args);
	}
}
