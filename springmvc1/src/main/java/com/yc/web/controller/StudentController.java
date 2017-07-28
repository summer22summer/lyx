package com.yc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yc.web.model.Student;

@Controller
public class StudentController {
	//使用@RequestMapping来映射请求的URI
	//返回值 会通过视图解析器解析 （InternalResourceViewResolver）为实际的物理视图
		//测试都是参数的传
	@RequestMapping(value="/student.action",method=RequestMethod.POST)
	public String hello(
			@RequestParam(value="sname",required=false)String sname, 
			@RequestParam(value="sage",required=false)String sage, 
			@RequestHeader(value="Host")String host, 
			@RequestHeader(value="User-Agent")String userAgent,
			@RequestHeader(value="Referer") String referer,
			@CookieValue(value="JSESSIONID")String sessionid ){
		System.out.println("yc==>hello world!! ,put");
		System.out.println(sname+"/t"+sage+"/t"+host+"/t"+referer);
		System.out.println("sessionid:"+sessionid);
		return "success";
	}

	@RequestMapping(value="/student_add.action",method=RequestMethod.POST)
	public String add(Student student){
		return null; 
		
	}
	
	
	
}
