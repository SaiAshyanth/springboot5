package com.netflix.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NetflixController {
	@GetMapping("/series")
	
public String series(@RequestParam String username)

{
	return "Hey "+username+" Welcome back to NETFLIX!";
}
}
