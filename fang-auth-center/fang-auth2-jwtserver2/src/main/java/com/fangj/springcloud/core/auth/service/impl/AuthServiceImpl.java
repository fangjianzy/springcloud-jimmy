package com.fangj.springcloud.core.auth.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fangj.springcloud.core.auth.admin.AccountDO;
import com.fangj.springcloud.core.auth.admin.Admin;
import com.fangj.springcloud.core.auth.dto.TokenDTO;
import com.fangj.springcloud.core.auth.service.AdminService;
import com.fangj.springcloud.core.auth.service.AuthService;
import com.fangj.springcloud.core.commons.exception.core.ExceptionCode;
import com.fangj.springcloud.core.exception.BizException;
import com.fangj.springcloud.core.jwt.IJWTInfo;
import com.fangj.springcloud.core.jwt.JWTInfo;
import com.fangj.springcloud.core.jwt.TokenVo;
import com.fangj.springcloud.core.jwt.util.client.JwtTokenUtil;

/**
 * @author jimmy
 * @createTime 2017-12-15 13:42
 */
@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private AdminService adminService;

    @Override
    public TokenVo login(String userName, String passWord) throws BizException {
        if (userName == null || passWord == null
                || userName.isEmpty() || passWord.isEmpty()) {
            throw new BizException(ExceptionCode.USER_NAME_PWD_ERROR.getCode(), ExceptionCode.USER_NAME_PWD_ERROR.getMsg());
        }
        Admin admin = adminService.get(userName, passWord);
        if (admin == null) {
            throw new BizException(ExceptionCode.USER_NAME_PWD_ERROR.getCode(), ExceptionCode.USER_NAME_PWD_ERROR.getMsg());
        }
        return jwtTokenUtil.generateToken(new JWTInfo(admin.getUsername(), admin.getId(), admin.getName(), admin.getAppId(),"bearer","webApp"));
    }

    @Override
    public TokenDTO login(String userName) throws BizException {
        if (userName == null || userName.isEmpty()) {
            throw new BizException(ExceptionCode.USER_NAME_PWD_ERROR.getCode(), ExceptionCode.USER_NAME_PWD_ERROR.getMsg());
        }
        AccountDO account = adminService.getAccount(userName);
        if (account == null) {
            throw new BizException(ExceptionCode.USER_NAME_PWD_ERROR.getCode(), ExceptionCode.USER_NAME_PWD_ERROR.getMsg());
        }
        TokenVo tokenVo = jwtTokenUtil.generateToken(new JWTInfo(account.getUserName(), account.getAdminId(), account.getName(), account.getAppId(),"bearer","webApp"));
        return new TokenDTO(tokenVo.getAccess_token(), tokenVo.getExpire());
    }

    @Override
    public TokenVo refresh(String userName, String passWord) throws BizException {
        return null;
    }

    @Override
    public void validate(String token) throws BizException {
        jwtTokenUtil.getInfoFromToken(token);
    }

    @Override
    public void invalid(String token) throws BizException {

    }

	@Override
	public IJWTInfo getCurrUser(String token) {
		return jwtTokenUtil.getInfoFromToken(token);
	}
}
