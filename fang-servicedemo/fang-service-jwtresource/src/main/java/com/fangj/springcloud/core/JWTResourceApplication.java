package com.fangj.springcloud.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 需要提供jwt的验证，资源才能访问到
* <p>Title: JWTResourceApplication</p>  
* <p>Description: </p>  
* @author jimmy.fang  
* @date 2018年6月12日
 */
@SpringBootApplication
@EnableEurekaClient
public class JWTResourceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(JWTResourceApplication.class, args);
	}
}
