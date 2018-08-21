package com.fangj.springcloud.core.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

public class AuthUtils {
	public static String getReqUser(HttpServletRequest req) {
		//token是携带在Header中的Authorization属性中
		String header = req.getHeader("Authorization");
		//类型默认是bearer
		String token = StringUtils.substringAfter(header, "bearer");
		Claims claims;
		try {
			claims = Jwts.parser().setSigningKey("SigningKey".getBytes("UTF-8")).parseClaimsJws(token).getBody();
		} catch (Exception e) {
			return null;
		}
		String localUser = (String) claims.get("userinfo");
		// 拿到当前用户
		return localUser;
	}
}
