package com.example.day1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController 
{
    @GetMapping("/welcome")
    public String print()
    {
    	return "Welcome";
    }


}
