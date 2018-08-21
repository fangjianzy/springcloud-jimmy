package org.fang.zuul.gateway.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fangj.springcloud.core.jwt.config.AppConfig;
import com.fangj.springcloud.core.jwt.config.WebConfig;
import com.fangj.springcloud.core.jwt.util.app.AppTokenUtil;
import com.fangj.springcloud.core.jwt.util.client.JwtTokenUtil;
/**
 * 加载配置
  * <p>Title: JwtApiConfiguration</p>  
  * <p>Description: </p>  
  * @author jimmy.fang  
  * @date 2018年6月21日
 */
@Configuration
@ComponentScan({"com.fangj.springcloud.core.jwt.config", "com.fangj.springcloud.core.jwt.util"})
public class JwtApiConfiguration {
	
	 @Bean
	 AppTokenUtil getAppTokenUtil() {
	    return new AppTokenUtil();
	 }

    @Bean
    JwtTokenUtil getPcJwtTokenUtil() {
        return new JwtTokenUtil();
    }
    
    @Bean
    AppConfig getAppConfig() {
        return new AppConfig();
    }

    @Bean
    WebConfig getWebConfig() {
        return new WebConfig();
    }
}
