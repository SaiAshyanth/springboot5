package com.diseaseDatabase.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diseaseDatabase.demo.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}