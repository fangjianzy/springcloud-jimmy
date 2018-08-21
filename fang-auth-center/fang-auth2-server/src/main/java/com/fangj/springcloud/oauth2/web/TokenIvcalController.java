package com.fangj.springcloud.oauth2.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenIvcalController {
	
	@Autowired
	private DefaultTokenServices defaultTokenServices;
	
	
	@RequestMapping(method = RequestMethod.GET,value="/Verification")
	public boolean Verification(String access_token){
		boolean b = true;
		try{
			OAuth2AccessToken accessToken = defaultTokenServices.readAccessToken(access_token);
			if (accessToken == null) {
				b = false;
				//throw new InvalidTokenException("Invalid access token: " + access_token);
			}
			else if (accessToken.isExpired()) {
				b = false;
				//throw new InvalidTokenException("Access token expired: " + access_token);
			}
		}catch(EmptyResultDataAccessException e){
			b = false;
		}
		return b;
	}
	/**
	 * 注销
	  * <p>Title: revokeToken</p>  
	  * <p>Description: </p>  
	  * @param access_token
	  * @return
	 */
	@RequestMapping(method = RequestMethod.DELETE, value = "/revokeToken")
	@ResponseBody
	public boolean revokeToken(String access_token) {
		boolean b  = false;
	    if (defaultTokenServices.revokeToken(access_token)){
	        System.out.println("注销成功");
	        b = true;
	    }else{
	        System.out.println("注销失败");
	        b = false;
	    }
	    return b;
	}
}
