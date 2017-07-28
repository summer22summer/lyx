package com.yc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	//使用@RequestMapping来映射请求 的URL
	//@Retur返回值 会通过视图来解析器解析（InternalResourceViewResolver）为实际的物理视图
	@RequestMapping(value="/hello/{uname}",method=RequestMethod.PUT)
	public String hello(@PathVariable("uname")String uname){
		
		System.out.println("yc===>hello world! ,PUT");
		System.out.println(uname);
		return "success";
	}
	
	@RequestMapping(value="/hello/{uname}",method=RequestMethod.DELETE)
	public String hello1(@PathVariable("uname")String uname){
		
		System.out.println("yc===>hello world! ,DELETE");
		System.out.println(uname);
		return "success";
	}

}
