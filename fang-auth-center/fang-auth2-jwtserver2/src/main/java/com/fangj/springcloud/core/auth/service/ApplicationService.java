package com.fangj.springcloud.core.auth.service;


import com.fangj.springcloud.core.jwt.TokenVo;

/**
 * @author zuihou
 * @createTime 2017-12-13 23:04
 */
public interface ApplicationService {
    TokenVo applyToken(String appId, String appSecret) ;
}
