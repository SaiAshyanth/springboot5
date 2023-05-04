package com.diseaseDatabase.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diseaseDatabase.demo.model.Demographics;

@Repository
public interface DemographicsRepository extends JpaRepository<Demographics, Integer>{

}
