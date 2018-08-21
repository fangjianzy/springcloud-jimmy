package org.fang.service.feign.fallback;

import org.fang.service.feign.FeignHystrixService;
import org.springframework.stereotype.Component;

/**  
 * 实现需要短路的服务 ，并IOC到容器
 * @author Jimmy.Fang
 * @date 2017年12月13日  新建  
 */
@Component
public class FeignHystrixServiceFallback implements FeignHystrixService {

	@Override
	public int getDtoById(Integer id) {
		System.out.println("service B Feign is not return ----->"+id);
		return 0;
	}



}
