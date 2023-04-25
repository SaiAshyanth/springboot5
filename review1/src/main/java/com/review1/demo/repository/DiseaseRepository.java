package com.review1.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.review1.demo.model.Disease;

@Repository
public interface DiseaseRepository extends JpaRepository<Disease,Integer> {

}
