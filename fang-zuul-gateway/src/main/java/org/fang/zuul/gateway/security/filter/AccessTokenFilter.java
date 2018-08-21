package org.fang.zuul.gateway.security.filter;

import javax.servlet.http.HttpServletRequest;

import org.fang.zuul.gateway.security.config.GateIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fangj.springcloud.core.jwt.IJWTInfo;
import com.fangj.springcloud.core.jwt.config.WebConfig;
import com.fangj.springcloud.core.jwt.util.app.AppTokenUtil;
import com.fangj.springcloud.core.jwt.util.client.JwtTokenUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 *  依赖白名单进行权限控制
  * <p>Title: AccessTokenFilter</p>  
  * <p>Description: 只要经过了网关验证，后面的微服务之间可以随意调用</p>  
  * @author jimmy.fang  
  * @date 2018年6月21日
 */
@Component
public class AccessTokenFilter extends ZuulFilter{
	
	@Autowired
    private GateIgnoreProperties gateIgnoreProperties;
	@Autowired
	private JwtTokenUtil WebtokenApi;
	@Autowired
	private AppTokenUtil apptokenApi;
	@Autowired
	private WebConfig webCfg;
    
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String requestUri = request.getRequestURI();
        String accessToken = request.getHeader(webCfg.getTokenHeader());
        String secret = request.getHeader(webCfg.getAdminHeader());
        System.out.println("requestUri="+requestUri+"     accessToken:"+accessToken +"  secret="+secret);
        //BaseContextHandler.setToken(null);
        // 不进行拦截的地址
        if (isStartWith(requestUri)) {
        	System.out.println("URL:"+requestUri+"=================>不拦截");
        	ctx.setSendZuulResponse(true);
            ctx.setResponseStatusCode(100);
        }else{
        	System.out.println("URL:"+requestUri+"=================>拦截");
        	if(accessToken == null) {
                ctx.setSendZuulResponse(false);
                ctx.setResponseStatusCode(404);
                ctx.setResponseBody("token cannot be empty");
            }else{
            	IJWTInfo jwt = WebtokenApi.getInfoFromToken(accessToken);
            	if(jwt !=null){
            		System.out.println("当前用户ID="+jwt.getUserName());
            		ctx.addZuulRequestHeader("access_token", accessToken);
            		ctx.setSendZuulResponse(true);
                    ctx.setResponseStatusCode(100);
            	}else{
            		ctx.setSendZuulResponse(false);
                    ctx.setResponseStatusCode(200);
                    ctx.setResponseBody("token is Access Diend!");
            	}
            }
        }
		return null;
	}

	@Override
	public String filterType() {
		 return "pre";
		
	}

	@Override
	public int filterOrder() {
		return 4;
	}
	
	/**
     * URI是否以什么打头
     *
     * @param requestUri
     * @return
     */
    private boolean isStartWith(String requestUri) {
        boolean flag = false;
        //TODO 实现正则匹配
        if (gateIgnoreProperties == null || gateIgnoreProperties.getStartWithList().isEmpty()) {
            return flag;
        }
        for (String s : gateIgnoreProperties.getStartWithList()) {
            if (requestUri.startsWith(s)) {
                return true;
            }
        }
        return flag;
    }
}
