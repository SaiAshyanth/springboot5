package com.netflix.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordController {
	@GetMapping("/login")
	public String login(@RequestParam String username,@RequestParam String password ) {
		if(username.equals("Ashyanth")&&password.equals("12345"))
		{
			return "Login successful";
		}
		else
		{
			return "Login fail...crctah login pannu";
		}
	}

}
