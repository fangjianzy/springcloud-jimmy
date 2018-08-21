package com.fangj.springcloud.core.jwt.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;

/**
 *  web读取配置
  * <p>Title: WebConfig</p>  
  * <p>Description: </p>  
  * @author jimmy.fang  
  * @date 2018年6月21日
 */
public class WebConfig {
	@Value("${auth.client.pub-key.path}")
    private String pubKeyPath;
    @Value("${auth.client.id:null}")
    private String clientId;
    @Value("${auth.client.secret}")
    private String clientSecret;
    @Value("${auth.client.token-header:access_token}")
    private String tokenHeader;
    /**
     * 放在请求头，以便区别当前请求来源
     * */
    @Value("${auth.client.admin-header:secret}")
    private String adminHeader;
    @Value("${spring.application.name}")
    private String applicationName;

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


    public String getClientId() {
        return "null".equals(clientId)?applicationName:clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getToken(HttpServletRequest request){
        return request.getHeader(this.getTokenHeader());
    }

    public String getAdminHeader() {
        return adminHeader;
    }
    public void setAdminHeader(String adminHeader) {
        this.adminHeader = adminHeader;
    }
}
