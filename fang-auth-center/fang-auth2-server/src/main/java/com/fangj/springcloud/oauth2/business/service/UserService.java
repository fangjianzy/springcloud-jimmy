package com.fangj.springcloud.oauth2.business.service;

import com.fangj.springcloud.oauth2.business.entity.RcUserEntity;

/**
 * Created by Mr.Yangxiufeng on 2017/12/27.
 * Time:15:12
 * ProjectName:Mirco-Service-Skeleton
 */
public interface UserService {
    RcUserEntity findByUsername(String username);
}
