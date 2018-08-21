package com.fangj.springcloud.core.auth.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fangj.springcloud.core.Result;
import com.fangj.springcloud.core.auth.service.ApplicationService;
import com.fangj.springcloud.core.exception.BizException;
import com.fangj.springcloud.core.jwt.TokenVo;

/**
 * 第三方应用通过API获取token
 * Created by jimmy
 */
@RestController
@RequestMapping("/app")
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;

    /**
     * 获取 第三方 token
     * @param appId appid
     * @param appSecret 密码
     * @return Result<TokenVo>
     * @throws Exception
     */
    @RequestMapping(value = "/token", method = RequestMethod.POST)
    public Result<TokenVo> applyToken(String appId, String appSecret) throws BizException {
        return Result.success(applicationService.applyToken(appId, appSecret));
    }

    /** 刷新token */
    /** 验证token */
}
