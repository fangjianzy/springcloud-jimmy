package com.fangj.springcloud.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 1、url=http://192.168.1.25:2001/hystrix
* 2、监控单个微服务：http://192.168.1.25:7070/hystrix.stream
* @author jimmy.fang  
* @date 2018年6月7日
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication.class, args);
    }
}
