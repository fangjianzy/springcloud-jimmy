package com.fangj.springcloud.oauth2.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * <p>必须要有，做验证</p>
 */
@RestController
public class UserController {
    @RequestMapping("/user")//必须要,resource-server会用到 
    public Principal user(Principal user) {
        return user;
    }
}
