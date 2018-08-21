package org.fang.service.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@RestController
@RequestMapping("/demo/api/v1")
public class FangProviderController {
	
	@GetMapping(value = "/{id}")
	public int getDtoById(@PathVariable("id") Integer id) {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		System.out.println("目标服务service B 获取参数="+id+"request head中的token="+request.getHeader("access_token"));
		return 100*id;
	}
}
