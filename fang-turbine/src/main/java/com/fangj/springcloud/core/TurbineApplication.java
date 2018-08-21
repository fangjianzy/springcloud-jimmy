package com.fangj.springcloud.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
/**
 * 1、访问：http://192.168.1.25:2001/hystrix.stream
 * 2、监控：http://192.168.1.25:2002/turbine.stream
* <p>Title: TurbineApplication</p>  
* <p>Description: </p>  
* @author jimmy.fang  
* @date 2018年6月7日
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbine
public class TurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class, args);
    }
}