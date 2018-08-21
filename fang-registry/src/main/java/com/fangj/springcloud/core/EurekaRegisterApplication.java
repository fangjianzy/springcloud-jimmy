package com.fangj.springcloud.core;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**  
 * 注册中心
 *  
 * @author Jimmy.Fang
 * @date 2017年12月28日  新建  
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaRegisterApplication {
	/**
	 * 入口程序
	 * @param args
	 */
	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaRegisterApplication.class).run(args);
	}
}
