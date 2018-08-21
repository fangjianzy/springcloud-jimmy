package com.fangj.springcloud.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableEurekaClient
//@EnableAuthorizationServer
public class AuthCenterProviderApplication {
   public static void main(String[] args){
       SpringApplication.run(AuthCenterProviderApplication.class, args);
   }
}
//1、http://localhost:8080/oauth/authorize?response_type=code&client_id=client&redirect_uri=http://www.baidu.com&state=123
//2、http://client:secret@localhost:8080/oauth/token?grant_type=authorization_code&redirect_uri=http://www.baidu.com&code=urVAJU