package com.fangj.springcloud.core.auth.admin;

import java.io.Serializable;

public class AccountDO implements Serializable{
	
	/** serialVersionUID*/  
	private static final long serialVersionUID = 1L;
	
	private Long adminId;
    private String userName;
    private String name;
    private String appId;
    private String appName;
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
    
    
}
