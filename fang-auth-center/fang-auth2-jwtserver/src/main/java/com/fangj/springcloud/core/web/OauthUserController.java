package com.fangj.springcloud.core.web;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OauthUserController {
	@GetMapping("/user")
    public Principal user(Principal user){
        return user;
    }
}
