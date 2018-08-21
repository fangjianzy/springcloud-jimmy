package com.fangj.springcloud.core.jwt;

import java.io.Serializable;

/**
 * JWT基本信息
 */
public class JWTInfo implements Serializable, IJWTInfo {
    private String userName;
    private Long adminId;
    private String name;
    private String appId;
    private String token_type;
    private String scope;
    
    public JWTInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JWTInfo(String userName, Long adminId, String name, String appId,String token_type,String scope) {
        this.userName = userName;
        this.adminId = adminId;
        this.name = name;
        this.appId = appId;
        this.token_type=token_type;
        this.scope=scope;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
    
    
    public String getToken_type() {
		return token_type;
	}

	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	/**
     * 重写equals 方法， 必须appid,username,adminId都相等， 两个对象相等
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        JWTInfo jwtInfo = (JWTInfo) o;

        if (appId != null ? !appId.equals(jwtInfo.appId) : jwtInfo.appId != null) {
            return false;
        }
        if (userName != null ? !userName.equals(jwtInfo.userName) : jwtInfo.userName != null) {
            return false;
        }
        return adminId != null ? adminId.equals(jwtInfo.adminId) : jwtInfo.adminId == null;

    }

    @Override
    public int hashCode() {
        int result = appId != null ? appId.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (adminId != null ? adminId.hashCode() : 0);
        return result;
    }

	@Override
	public String getTokenType() {
		return token_type;
	}
}
