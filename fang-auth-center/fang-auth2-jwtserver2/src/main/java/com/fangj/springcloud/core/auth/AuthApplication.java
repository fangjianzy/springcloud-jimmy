package com.fangj.springcloud.core.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 完全自定义方式实现jwt的token
  * <p>Title: AuthApplication</p>  
  * <p>Description: </p>  
  * @author jimmy.fang  
  * @date 2018年6月21日
 */
@SpringBootApplication
@EnableEurekaClient
public class AuthApplication {
	public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class,args);
    }
}



/**
 1、获取token
  http://192.168.1.25:9775/client/token
 {
	"userName":"fangjian",
	"passWord":"123456"
 }
 验证token
 2、http://192.168.1.25:9775/client/verify?token=eyJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJmYW5namlhbiIsImFkbWluSWQiOjIsIm5hbWUiOiJhcHAiLCJhcHBJZCI6ImFwcCIsImV4cCI6MTUyODg5Mjg2OH0.hi5jmiyqLsKvkAjj7BhEUxD52LuZIK6_aVbaUT0mgHUJjZz8phklh0hCGTjtIcpSan31GCNEyvbfXBUKBPUXfGCAhQYWbdbUzfyX386ikGU8I0Z1_OnDI3yyDyLbEWd1Rp18tSkdZGkdCgSxwg0iIJRjaTGZ9awKXlLL2wRfdug
 
 3、登录 POST
 http://192.168.1.25:9775/client/login
 userName fangj
 
 4、根据token获取当前登录人
 GET
 http://192.168.1.25:9775/client/user?token=eyJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJhZG1pbiIsImFkbWluSWQiOjEsImFwcElkIjoid2ViYXBwIiwiZXhwIjoxNTI4ODkxMjQyfQ.F1xMISJlpStBFrc8eXQPYU36IFYFEhuV6qQmYNTbQu1PmFvtgz_EEmMp14hM7dCtKFRcmF0xWDpg76MYuDujVxXlNoR19cyiUESPX5XTQwbusISiUrZ08GFP7LCxkavQ6BRQ-n8pDVTKv97L5osE0A_VYb7RQmZx8dk4gbK_DXs
 
 *
*/