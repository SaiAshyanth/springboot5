package com.diseaseDatabase.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diseaseDatabase.demo.model.Patient;
import com.diseaseDatabase.demo.repository.PatientRepository;

@Service
public class PatientDemographicsService {
	@Autowired
	PatientRepository patRepository;
	public List<Patient>fetchAllPersons()
	   {
		   return patRepository.findAll();
	   }
    public Patient savePersons(Patient p)
	   {
		   return patRepository.save(p);
	   }

}
