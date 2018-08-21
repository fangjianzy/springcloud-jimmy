package com.fangj.springcloud.core.auth.service.impl;

import org.springframework.stereotype.Service;

import com.fangj.springcloud.core.auth.admin.AccountDO;
import com.fangj.springcloud.core.auth.admin.Admin;
import com.fangj.springcloud.core.auth.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Override
	public Admin get(String userName, String passWord) {
		Admin admin = new Admin();
		admin.setUsername("admin");
		admin.setPassword("admin");
		admin.setAppId("webapp");
		admin.setId(1l);
		return admin;
	}

	@Override
	public AccountDO getAccount(String userName) {
		AccountDO acc = new AccountDO();
		acc.setAdminId(2l);
		acc.setAppId("app");
		acc.setAppName("app");
		acc.setName("app");
		acc.setUserName("fangjian");
		return acc;
	}

}
