package com.diseaseDatabase.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.diseaseDatabase.demo.model.User;
import com.diseaseDatabase.demo.service.UserService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class UserContoller {
	 @Autowired
     UserService uService;
	 @Tag(name="LOGIN",description="login")
     @PostMapping("/login")
      public String login(@RequestBody Map<String,String> loginData)
      {
    	 String uname = loginData.get("uname");
    	 String password = loginData.get("password");
    	 String result = uService.checkLogin(uname,password);
    	 return result;
      }
	 @Tag(name="Post Method to add login details",description="Add login details")
       @PostMapping("/adduser")
       public User AddUser(@RequestBody User u)
       {
    	   return uService.addUser(u);
       }
	 @Tag(name="Get Method to get all User Details",description="Get All User info")
       @GetMapping("/add")
       public List<User> listAll()
       {
    	   return uService.getUser();
    	 
       }
	 @Tag(name="Put Method to Update login details using id",description="Update by id")
      @PutMapping(value="/put/{id}")
      public User updateUser(@RequestBody User us,@PathVariable int userid)
      {
    	  return uService.updateUser(us, userid);
      }
}
