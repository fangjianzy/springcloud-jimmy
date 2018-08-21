package org.fang.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceBProvideApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiceBProvideApplication.class, args);
	}
}
