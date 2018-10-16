package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.feign.EurekaServiceFeign;

@RestController
public class HelloController {
	@Autowired 	//调用接口
	private EurekaServiceFeign feign;
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name){
		return feign.hello(name);	//调用服务提供者
	}
}