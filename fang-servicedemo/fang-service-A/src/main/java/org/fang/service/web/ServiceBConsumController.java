package org.fang.service.web;

import java.util.Map;

import org.fang.service.feign.FeignHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicea/api/v1/")
public class ServiceBConsumController {
	
	@Autowired
	private FeignHystrixService serviceb;
	
	@GetMapping(value = "/{id}")
	public int getDtoById(@PathVariable("id") Integer id) {
		System.out.println("service A----->"+id);
		return serviceb.getDtoById(id);
	}
}
