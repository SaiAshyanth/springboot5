package com.netflix.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.demo.model.Person;
import com.netflix.demo.service.AddressPersonService;

@RestController
public class AddressPersonController {
	@Autowired
	AddressPersonService apService;
	@GetMapping("/getAllPersons")
     public List<Person> fetchAllPersons()
	   {
		  return apService.fetchAllPersons();
	   }
	   @PostMapping("/saveAlldata")
	   public Person savePersons(@RequestBody Person p)
	   {
		   return apService.savePersons(p);
	   }
}
