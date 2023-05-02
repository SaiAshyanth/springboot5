package com.review.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.review.demo.model.Reg;
import com.review.demo.service.RegService;

@RestController
public class RegController {
	@Autowired
    RegService rService;
    @PostMapping("/registereduser")
    public Reg saveRegistration(@RequestBody Reg r)
    {
  	  return rService.saveRegistration(r);
    }
    @GetMapping("/fetchalldata")
    public List<Reg> getAllUsers()
    {
    	List<Reg> dList=rService.getAllUsers();
    	return dList;
    }
	

}
