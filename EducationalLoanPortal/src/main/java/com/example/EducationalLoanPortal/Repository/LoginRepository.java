package com.example.EducationalLoanPortal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EducationalLoanPortal.Model.LoginModel;
@Repository
public interface LoginRepository extends JpaRepository<LoginModel, Integer>{

}
