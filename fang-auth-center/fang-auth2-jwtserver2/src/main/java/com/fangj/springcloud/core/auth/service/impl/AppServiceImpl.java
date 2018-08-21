package com.fangj.springcloud.core.auth.service.impl;

import org.springframework.stereotype.Service;

import com.fangj.springcloud.core.auth.admin.Applications;
import com.fangj.springcloud.core.auth.service.AppService;

@Service
public class AppServiceImpl implements AppService {

	@Override
	public Applications getBySecret(String appId, String appSecret) {
		Applications app = new Applications();
		app.setAppId("webapp");
		app.setAppName("ddasd");
		app.setIsEnable(true);
		return app;
	}

}
