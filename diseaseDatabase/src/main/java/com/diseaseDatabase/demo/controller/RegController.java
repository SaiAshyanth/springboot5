package com.diseaseDatabase.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.diseaseDatabase.demo.model.Reg;
import com.diseaseDatabase.demo.service.RegService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class RegController {
	@Autowired
    RegService rService;
	@Tag(name="Post Method to Add User",description="Add User info")
    @PostMapping("/registereduser")
    public Reg saveRegistration(@RequestBody Reg r)
    {
  	  return rService.saveRegistration(r);
    }
	@Tag(name="Get Method to get All User Details",description="Get All User info")
    @GetMapping("/fetchalldata")
    public List<Reg> getAllUsers()
    {
    	List<Reg> dList=rService.getAllUsers();
    	return dList;
    }
	

}
