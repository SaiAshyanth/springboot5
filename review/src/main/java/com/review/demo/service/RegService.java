package com.review.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.review.demo.model.Reg;
import com.review.demo.repository.RegRepository;

@Service
public class RegService {
	
	    @Autowired
	    RegRepository rRepository;
	

	public Reg saveRegistration(Reg r) {
		
		return rRepository.save(r);
	}

	public List<Reg> getAllUsers() {
		List<Reg> dList = rRepository.findAll();
		return dList;
	}
}