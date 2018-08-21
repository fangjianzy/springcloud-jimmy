package org.fang.zuul.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 *  统一在网关进行权限认证，内部微服务畅通无阻
  * <p>Title: ZuulGateWayApplication</p>  
  * <p>Description: </p>  
  * @author jimmy.fang  
  * @date 2018年6月21日
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulGateWayApplication {

	public static void main(String[] args) {
        SpringApplication.run(ZuulGateWayApplication.class, args);
    }
}
