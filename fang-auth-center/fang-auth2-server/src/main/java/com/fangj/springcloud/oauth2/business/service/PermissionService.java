package com.fangj.springcloud.oauth2.business.service;

import java.util.List;

import com.fangj.springcloud.oauth2.business.entity.RcMenuEntity;

/**
 * Created by Mr.Yangxiufeng on 2017/12/29.
 * Time:12:37
 * ProjectName:Mirco-Service-Skeleton
 */
public interface PermissionService {
    List<RcMenuEntity> getPermissionsByRoleId(Integer roleId);
}
