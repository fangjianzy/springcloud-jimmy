package com.fangj.springcloud.core.jwt.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;

/**
 *  APP请求读取配置文件
  * <p>Title: AppConfig</p>  
  * <p>Description: </p>  
  * @author jimmy.fang  
  * @date 2018年6月21日
 */
public class AppConfig {
	
	@Value("${auth.app.pub-key.path}")
    private String pubKeyPath;
    @Value("${auth.app.token-header}")
    private String tokenHeader;

    public String getTokenHeader() {
        return tokenHeader;
    }

    public void setTokenHeader(String tokenHeader) {
        this.tokenHeader = tokenHeader;
    }

    public String getPubKeyPath() {
        return pubKeyPath;
    }

    public void setPubKeyPath(String pubKeyPath) {
        this.pubKeyPath = pubKeyPath;
    }

    public String getToken(HttpServletRequest request){
        return request.getHeader(this.getTokenHeader());
    }
}
