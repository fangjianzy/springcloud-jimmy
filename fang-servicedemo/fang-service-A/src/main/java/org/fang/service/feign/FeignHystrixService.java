package org.fang.service.feign;

import org.fang.service.feign.fallback.FeignHystrixServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**  
 * feign消费端自动断路器，只需要开启配置即可使用
 *  
 * @author Jimmy.Fang
 * @date 2017年12月13日  新建  
 */
@FeignClient(name = "fangserverb",fallback = FeignHystrixServiceFallback.class)
public interface FeignHystrixService {
	
	@RequestMapping(value = "/demo/api/v1/{id}", method = RequestMethod.GET)
	public int getDtoById(@PathVariable("id")  Integer id);

}
