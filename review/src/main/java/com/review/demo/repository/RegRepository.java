package com.review.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.review.demo.model.Reg;

@Repository
public interface RegRepository extends JpaRepository<Reg, Integer>{

}
