package com.fangj.springcloud.oauth2.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fangj.springcloud.oauth2.business.entity.RcRoleEntity;
import com.fangj.springcloud.oauth2.business.repository.RoleRepository;
import com.fangj.springcloud.oauth2.business.service.RoleService;

/**
 * Created by Mr.Yangxiufeng on 2017/12/29.
 * Time:12:31
 * ProjectName:Mirco-Service-Skeleton
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public List<RcRoleEntity> getRoleValuesByUserId(Integer userId) {
        return roleRepository.getRoleValuesByUserId(userId);
    }
}
