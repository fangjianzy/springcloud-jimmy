package com.fangj.springcloud.core.auth.bean;

import java.io.Serializable;

/**
 * 用户登录输入参数
 * @author jimmy
 * @createTime 2017-12-15 11:58
 */
public class JwtAuthRequest implements Serializable {
    private String userName;
    private String passWord;
    
    

    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public JwtAuthRequest() {
    }

    public JwtAuthRequest(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
}
