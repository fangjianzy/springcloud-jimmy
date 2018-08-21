package org.fang.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
/**
 * 模拟A服务的集群
* <p>Title: ServiceAAFeignApplication</p>  
* <p>Description: </p>  
* @author jimmy.fang  
* @date 2018年6月8日
 */
@SpringBootApplication
@EnableFeignClients      //feign实现消费端
@EnableDiscoveryClient   //消费端
@EnableCircuitBreaker    //开启断路器
public class ServiceAAFeignApplication {
	
	public static void main(String[] args) {
	    SpringApplication.run(ServiceAAFeignApplication.class, args);
	}
}
