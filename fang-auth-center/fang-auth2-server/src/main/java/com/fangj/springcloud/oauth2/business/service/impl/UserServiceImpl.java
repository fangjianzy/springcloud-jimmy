package com.fangj.springcloud.oauth2.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fangj.springcloud.oauth2.business.entity.RcUserEntity;
import com.fangj.springcloud.oauth2.business.repository.UserRepository;
import com.fangj.springcloud.oauth2.business.service.UserService;

/**
 * Created by Mr.Yangxiufeng on 2017/12/27.
 * Time:15:13
 * ProjectName:Mirco-Service-Skeleton
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public RcUserEntity findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
