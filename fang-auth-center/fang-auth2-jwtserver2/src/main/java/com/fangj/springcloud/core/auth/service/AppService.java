package com.fangj.springcloud.core.auth.service;

import com.fangj.springcloud.core.auth.admin.Applications;

public interface AppService {
	Applications getBySecret(String appId, String appSecret);
}
