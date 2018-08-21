package com.fangj.springcloud.core.auth.service;


import com.fangj.springcloud.core.auth.dto.TokenDTO;
import com.fangj.springcloud.core.exception.BizException;
import com.fangj.springcloud.core.jwt.IJWTInfo;
import com.fangj.springcloud.core.jwt.TokenVo;

/**
 * @author zuihou
 * @createTime 2017-12-15 13:41
 */
public interface AuthService {
	
    TokenVo login(String userName, String passWord) ;

    TokenDTO login(String userName) throws BizException;

    TokenVo refresh(String userName, String passWord) ;

    void validate(String token);

    void invalid(String token);
    
    IJWTInfo getCurrUser(String token);
}
