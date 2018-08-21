package com.fangj.springcloud.core.jwt;

/**
 * 生成JWT的接口
 */
public interface IJWTInfo {
    /**
     * 获取用户登录名
     *
     * @return
     */
    String getUserName();

    /**
     * 获取用户ID
     *
     * @return
     */
    Long getAdminId();

    /**
     * 获取名称
     *
     * @return
     */
    String getName();

    /**
     * 应用id
     */
    String getAppId();
    
    String getTokenType();
    
    String getScope();
}
