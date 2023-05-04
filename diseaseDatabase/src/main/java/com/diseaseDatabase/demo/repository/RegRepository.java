package com.diseaseDatabase.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diseaseDatabase.demo.model.Reg;

@Repository
public interface RegRepository extends JpaRepository<Reg, Integer>{

}
