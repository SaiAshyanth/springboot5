package com.review.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.review.demo.model.Disease;

@Repository
public interface DiseaseRepository extends JpaRepository<Disease,Integer> 
{
	List<Disease> findByNameStartingWith(String prefix);
	List<Disease> findByNameEndingWith(String suffix);
	List<Disease> findByCountry(String country);
	

}
