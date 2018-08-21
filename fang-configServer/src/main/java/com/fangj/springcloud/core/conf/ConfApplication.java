package com.fangj.springcloud.core.conf;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;


/**  
 * 配置服务中心,访问git
 *  URL:
 *  http://localhost:7030/jimmy-config/prod/
 *  http://localhost:7030/jimmy-config/test/
 *  http://localhost:7030/jimmy-config/local/
 *  
 *  http://localhost:7030/tms-config/prod/
 *  
 *  直接看git文件结果：
 *  http://localhost:7030/tms-config-prod.properties
 *  http://localhost:7030/tms-config/test/
 *  2、git跟新，则读到文件内容也会实时更新。
 * @author Jimmy.Fang
 * @date 2017年12月14日  新建  
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfApplication.class).run(args);
	}
}
