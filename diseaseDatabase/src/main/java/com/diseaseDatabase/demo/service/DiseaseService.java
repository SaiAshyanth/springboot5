package com.diseaseDatabase.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.diseaseDatabase.demo.model.Disease;
import com.diseaseDatabase.demo.repository.DiseaseRepository;


import jakarta.transaction.Transactional;

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
	public  Disease updateDisease(Disease d,int num) {
		Optional<Disease> optional=disRepository.findById(num);
		Disease obj=null;
		if(optional.isPresent())
		{
			obj=optional.get();
		    disRepository.save(d);
		}
		return obj;
	}
	public void deleteDisease(int num)
	{
		disRepository.deleteById(num);
	}
	public List<Disease> sortDisease(String name)
	{
		return disRepository.findAll(Sort.by(name).descending());
	}
	public List<Disease> paginate(int num, int size) 
	{
		Page<Disease> p=disRepository.findAll(PageRequest.of(num, size));
		return p.getContent();
	}
	public List<Disease> paginate(int num, int size, String name) 
	{
		Page<Disease> obj=disRepository.findAll(PageRequest.of(num, size,Sort.by(name)));
		return obj.getContent();
	}
	public List<Disease> fetchDiseaseByNamePrefix(String prefix)
	{
		return disRepository.findByNameStartingWith(prefix);
	}
	public List<Disease> fetchDiseaseByNameSuffix(String suffix)
	{
		return disRepository.findByNameEndingWith(suffix);
	}
	public List<Disease> fetchDiseaseByNameCountry(String country)
	{
		return disRepository.findByCountry(country);
	}
	public List<Disease> getDiseaseByCountry(String country,String name)
	  {
		  return disRepository.getDiseaseByCountry(country,name);
	  }
	@Transactional 
     public int deleteDiseaseByName(String name) {
		
		return disRepository.deleteDiseaseByName(name);
	}
	@Transactional
	public int updateDiseaseByName(String country,String name)
	{
		return disRepository.updateDiseaseByName(country, name);
	}
	public List<Disease> fetchDiseaseByCountry(String country)
	{
		return disRepository.fetchDiseaseByCountry(country);
	}
}
