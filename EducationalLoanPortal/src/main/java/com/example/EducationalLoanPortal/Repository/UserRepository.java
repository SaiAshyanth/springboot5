package com.example.EducationalLoanPortal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EducationalLoanPortal.Model.UserModel;
@Repository
public interface UserRepository extends JpaRepository<UserModel,Integer>
{
	UserModel findByEmail(String email);
}
