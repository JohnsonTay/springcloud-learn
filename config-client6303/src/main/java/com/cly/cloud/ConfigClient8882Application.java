package com.cly.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClient8882Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClient8882Application.class, args);
	}
}
