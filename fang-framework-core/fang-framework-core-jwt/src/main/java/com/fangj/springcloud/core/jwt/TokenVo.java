package com.fangj.springcloud.core.jwt;


import java.io.Serializable;

/**
 * @author 传输给页面的vo
 * @createTime 2017-12-15 11:22
 */
public class TokenVo implements Serializable{
	
    /** serialVersionUID*/  
	private static final long serialVersionUID = 1L;
	
	/** token */
    private String access_token;
    /** 有效时间：单位：秒 */
    private Integer expire;
    
    private String token_type;
    
    private String scope;

    public TokenVo() {
        super();
    }


	public TokenVo(String access_token, Integer expire, String token_type,String scope) {
		super();
		this.access_token = access_token;
		this.expire = expire;
		this.token_type = token_type;
		this.scope = scope;
	}


	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public Integer getExpire() {
		return expire;
	}

	public void setExpire(Integer expire) {
		this.expire = expire;
	}


	public String getToken_type() {
		return token_type;
	}


	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}


	public String getScope() {
		return scope;
	}


	public void setScope(String scope) {
		this.scope = scope;
	}
    
    
}
