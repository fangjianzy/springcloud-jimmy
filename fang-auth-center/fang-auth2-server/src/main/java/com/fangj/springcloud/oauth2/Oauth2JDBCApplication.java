package com.fangj.springcloud.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * Created by xw on 2017/2/20.
 * 2017-02-20 16:51
 */
@SpringBootApplication
@EnableResourceServer//必须要
@EnableEurekaClient
public class Oauth2JDBCApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2JDBCApplication.class);
	}

}
