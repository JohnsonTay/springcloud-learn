package com.cly.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClient8762Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient8762Application.class, args);
	}
}
