package com.fangj.springcloud.core.auth.service;

import com.fangj.springcloud.core.auth.admin.AccountDO;
import com.fangj.springcloud.core.auth.admin.Admin;

public interface AdminService {
	Admin get(String userName, String passWord);
	AccountDO getAccount(String userName);
}
