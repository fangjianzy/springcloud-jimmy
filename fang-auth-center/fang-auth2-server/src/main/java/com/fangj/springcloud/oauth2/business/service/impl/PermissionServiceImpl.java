package com.fangj.springcloud.oauth2.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fangj.springcloud.oauth2.business.entity.RcMenuEntity;
import com.fangj.springcloud.oauth2.business.repository.PermissionRepository;
import com.fangj.springcloud.oauth2.business.service.PermissionService;

/**
 * Created by Mr.Yangxiufeng on 2017/12/29.
 * Time:12:38
 * ProjectName:Mirco-Service-Skeleton
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionRepository permissionRepository;
    @Override
    public List<RcMenuEntity> getPermissionsByRoleId(Integer roleId) {
        return permissionRepository.getPermissionsByRoleId(roleId);
    }
}
