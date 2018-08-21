package com.fangj.springcloud.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * JWT扩展返回+redsi存储，内存最简短版本实现，扮演用户中心角色，提供授权认证服务 
* @author jimmy.fang  
* @date 2018年6月12日
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAuthorizationServer
public class JWTAuthServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(JWTAuthServiceApplication.class, args);
	}
}
