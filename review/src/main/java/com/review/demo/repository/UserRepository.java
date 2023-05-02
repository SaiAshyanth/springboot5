package com.review.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.review.demo.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User,Integer>{
	User findByuname(String uname);

}
