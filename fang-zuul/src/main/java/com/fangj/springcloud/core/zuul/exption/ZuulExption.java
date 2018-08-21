package com.fangj.springcloud.core.zuul.exption;

import java.util.Map;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;

@Component
public class ZuulExption extends DefaultErrorAttributes{
	@Override
    public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
        Map<String, Object> result = super.getErrorAttributes(requestAttributes, includeStackTrace);
        result.put("status", 400);
        result.put("error", "error");
        result.put("exception", "exception");
        result.put("message", "message");
        return result;
    }
}
