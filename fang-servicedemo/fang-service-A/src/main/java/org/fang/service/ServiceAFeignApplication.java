package org.fang.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
/**
 *  依赖jdbc权限服务
  * <p>Title: ServiceAFeignApplication</p>  
  * <p>Description: </p>  
  * @author jimmy.fang  
  * @date 2018年6月21日
 */
@SpringBootApplication
@EnableFeignClients      //feign实现消费端
@EnableDiscoveryClient   //消费端
@EnableCircuitBreaker    //开启断路器
@EnableResourceServer    //oauth2资源服务
public class ServiceAFeignApplication {
	
	public static void main(String[] args) {
	    SpringApplication.run(ServiceAFeignApplication.class, args);
	}
	
}
