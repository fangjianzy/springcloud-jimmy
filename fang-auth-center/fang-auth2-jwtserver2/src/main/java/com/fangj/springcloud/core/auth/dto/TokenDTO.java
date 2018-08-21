package com.fangj.springcloud.core.auth.dto;

import java.io.Serializable;


public class TokenDTO implements Serializable {
    /** serialVersionUID*/  
	private static final long serialVersionUID = 1L;
	/**
     * token
     */
    private String token;
    /**
     * 有效时间：单位：秒
     */
    private Integer expire;
    
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Integer getExpire() {
		return expire;
	}
	public void setExpire(Integer expire) {
		this.expire = expire;
	}
	public TokenDTO(String token, Integer expire) {
		super();
		this.token = token;
		this.expire = expire;
	}
	public TokenDTO() {
		
	}
    
	
    
}
