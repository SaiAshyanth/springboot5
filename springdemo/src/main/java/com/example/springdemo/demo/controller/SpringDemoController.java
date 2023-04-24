package com.example.springdemo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringDemoController {
	@ResponseBody
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String welcome()
	{
		return "Ashyanth";
	}
	
}
