package org.fang.zuul.gateway.security.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.google.common.collect.Lists;

/**
 *  配置网关不需要传token的白名单
  * <p>Title: GateIgnoreProperties</p>  
  * <p>Description: </p>  
  * @author jimmy.fang  
  * @date 2018年6月21日
 */
@ConfigurationProperties(GateIgnoreProperties.PREFIX)
@Configuration
public class GateIgnoreProperties {
    public static final String PREFIX = "gateway.ignore";
    private List<String> startWithList = Lists.newArrayList();
    
	public List<String> getStartWithList() {
		return startWithList;
	}
	public void setStartWithList(List<String> startWithList) {
		this.startWithList = startWithList;
	}
	public GateIgnoreProperties(List<String> startWithList) {
		super();
		this.startWithList = startWithList;
	}
	public GateIgnoreProperties() {
		
	}
    
}
