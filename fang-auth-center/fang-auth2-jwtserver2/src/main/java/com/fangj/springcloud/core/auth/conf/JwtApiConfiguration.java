package com.fangj.springcloud.core.auth.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fangj.springcloud.core.jwt.util.app.AppTokenUtil;
import com.fangj.springcloud.core.jwt.util.client.JwtTokenUtil;

/**
 * 加载jwt生成和检验工具
  * <p>Title: JwtApiConfiguration</p>  
  * <p>Description: </p>  
  * @author jimmy.fang  
  * @date 2018年6月21日
 */
@Configuration
@ComponentScan({"com.fangj.springcloud.core.jwt.config"})
public class JwtApiConfiguration {
	
	 @Bean
	 AppTokenUtil getAppTokenUtil() {
	    return new AppTokenUtil();
	 }

    @Bean
    JwtTokenUtil getPcJwtTokenUtil() {
        return new JwtTokenUtil();
    }
}
