package com.example.EducationalLoanPortal.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EducationalLoanPortal.Model.LoanApplicationModel;
import com.example.EducationalLoanPortal.Repository.LoanApplicationModelRepository;

@Service
public class AdminService {
	@Autowired
    LoanApplicationModelRepository loanApp;
    public List<LoanApplicationModel> getAdmin() 
	{
		
    	return loanApp.findAll();
	}
	public LoanApplicationModel saveDeatils(LoanApplicationModel lm) 
	{
		
		return loanApp.save(lm);
	}

	

}
