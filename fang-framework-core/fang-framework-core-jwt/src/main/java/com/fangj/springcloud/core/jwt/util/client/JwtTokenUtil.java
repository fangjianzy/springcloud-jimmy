package com.fangj.springcloud.core.jwt.util.client;


import org.springframework.beans.factory.annotation.Value;

import com.fangj.springcloud.core.exception.BizException;
import com.fangj.springcloud.core.jwt.IJWTInfo;
import com.fangj.springcloud.core.jwt.JWTHelper;
import com.fangj.springcloud.core.jwt.TokenVo;

/**
  * pc端jwt工具  
  * @author jimmy.fang  
  * @date 2018年6月21日
 */
public class JwtTokenUtil {

    @Value("${client.expire}")
    private int expire;
    @Value("${client.pri-key.path}")
    private String priKeyPath;
    @Value("${client.pub-key.path}")
    private String pubKeyPath;

    public TokenVo generateToken(IJWTInfo jwtInfo) throws BizException {
        return JWTHelper.generateToken(jwtInfo, priKeyPath, expire);
    }

    public IJWTInfo getInfoFromToken(String token) throws BizException {
        return JWTHelper.getInfoFromToken(token, pubKeyPath);
    }


}
