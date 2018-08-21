package com.fangj.springcloud.oauth2.business.service;

import java.util.List;

import com.fangj.springcloud.oauth2.business.entity.RcRoleEntity;

/**
 * Created by Mr.Yangxiufeng on 2017/12/29.
 * Time:12:30
 * ProjectName:Mirco-Service-Skeleton
 */
public interface RoleService {
    List<RcRoleEntity> getRoleValuesByUserId(Integer userId);
}
