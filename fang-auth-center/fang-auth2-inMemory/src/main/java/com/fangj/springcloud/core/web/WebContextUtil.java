package com.fangj.springcloud.core.web;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
/**
 * 获取当前用户信息
  * <p>Title: WebContextUtil</p>  
  * <p>Description: </p>  
  * @author jimmy.fang  
  * @date 2018年8月15日
 */
public class WebContextUtil {
	
	public static Authentication getAuthentication() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            return authentication;
        }
        throw  new AuthenticationServiceException("authentication not found");
    }
}
