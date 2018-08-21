package com.fangj.springcloud.core.web;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UaaController {
	/**
	 * 获取当前用户
	  * <p>Title: user</p>  
	  * <p>Description: </p>  
	  * @param user
	  * @return
	 */
	@GetMapping("/user")
    public Principal user(Principal user){
        return user;
    }
}
