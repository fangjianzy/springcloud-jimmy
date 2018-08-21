package com.fangj.springcloud.core.jwt.util.app;


import org.springframework.beans.factory.annotation.Value;

import com.fangj.springcloud.core.exception.BizException;
import com.fangj.springcloud.core.jwt.IJWTInfo;
import com.fangj.springcloud.core.jwt.JWTHelper;
import com.fangj.springcloud.core.jwt.TokenVo;

/**
 * app端jwt工具
 */
public class AppTokenUtil {
    @Value("${jwt.expire}")
    private int expire;
    @Value("${jwt.pri-key.path}")
    private String priKeyPath;
    @Value("${jwt.pub-key.path}")
    private String pubKeyPath;

    public TokenVo generateToken(IJWTInfo jwtInfo) throws BizException {
        return JWTHelper.generateToken(jwtInfo, priKeyPath, expire);
    }

    public IJWTInfo getInfoFromToken(String token) throws BizException {
        return JWTHelper.getInfoFromToken(token, pubKeyPath);
    }
}