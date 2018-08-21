package com.fangj.springcloud.oauth2.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fangj.springcloud.oauth2.business.entity.RcUserEntity;

/**
 * Created by Mr.Yangxiufeng on 2017/12/27.
 * Time:14:52
 * ProjectName:Mirco-Service-Skeleton
 */
@Repository
public interface UserRepository extends JpaRepository<RcUserEntity,Integer>{
    RcUserEntity findByUsername(String username);
}
