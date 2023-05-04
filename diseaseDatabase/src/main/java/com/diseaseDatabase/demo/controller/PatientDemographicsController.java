package com.diseaseDatabase.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.diseaseDatabase.demo.model.Patient;
import com.diseaseDatabase.demo.service.PatientDemographicsService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class PatientDemographicsController {
	@Autowired
	PatientDemographicsService patService;
	@Tag(name="Get Method to get All Patient Details",description="Get All Patient info")
	@GetMapping("/getAllPatients")
     public List<Patient> fetchAllPersons()
	   {
		  return patService.fetchAllPersons();
	   }
	@Tag(name="Post Method to add Patient details",description="Add a Patient info")
	   @PostMapping("/saveAlldata")
	   public Patient savePersons(@RequestBody Patient p)
	   {
		   return patService.savePersons(p);
	   }
		

}
