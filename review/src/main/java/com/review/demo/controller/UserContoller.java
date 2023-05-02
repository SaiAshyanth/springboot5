package com.review.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.review.demo.model.User;
import com.review.demo.service.UserService;

@RestController
public class UserContoller {
	 @Autowired
     UserService uService;
     @PostMapping("/login")
      public String login(@RequestBody Map<String,String> loginData)
      {
    	 String uname = loginData.get("uname");
    	 String password = loginData.get("password");
    	 String result = uService.checkLogin(uname,password);
    	 return result;
      }
       @PostMapping("/adduser")
       public User AddUser(@RequestBody User u)
       {
    	   return uService.addUser(u);
       }
       @GetMapping("/add")
       public List<User> listAll()
       {
    	   return uService.getUser();
    	 
       }
      @PutMapping(value="/put/{id}")
      public User updateUser(@RequestBody User us,@PathVariable int userid)
      {
    	  return uService.updateUser(us, userid);
      }
}
