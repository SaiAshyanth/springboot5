package com.diseaseDatabase.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diseaseDatabase.demo.model.User;
import com.diseaseDatabase.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
    UserRepository userRep;
	public String checkLogin(String uname, String password) 
	{
		User u = userRep.findByuname(uname) ;
		if(u == null)
		{
			return" No user found " ;
		}
		else
		{
			if(u.getPassword().equals(password))
			{
				return"Login Successfull" ;
			}
			else
			{
				return "Login Failed" ;
			}
		}
	}
	
	public User addUser(User m)
	{
		return userRep.save(m) ;
	}
	
	public List<User> getUser()
	{
		return userRep.findAll() ;
	}
	public User updateUser(User us,int userid)
	{
		Optional<User> optional = userRep.findById(userid);
		User obj = null;
		if(optional.isPresent())
		{
			 obj = optional.get();
			 userRep.save(us);
		}
		return obj;
	}
	

}
