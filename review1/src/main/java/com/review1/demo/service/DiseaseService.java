package com.review1.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.review1.demo.model.Disease;
import com.review1.demo.repository.DiseaseRepository;

@Service
public class DiseaseService {
	@Autowired
	DiseaseRepository disRepository;
	public List<Disease> getAllDisease()
	{
		List<Disease> disList=disRepository.findAll();
		return disList;
	}
	public Disease saveDisease(Disease d) {
		Disease obj=disRepository.save(d);
		return obj;
	}
	public Disease updateDisease(Disease d) {
		Disease obj=disRepository.save(d);
		return obj;
	}
	public void deleteDisease(int regno)
	{
		disRepository.deleteById(regno);
	}
}
