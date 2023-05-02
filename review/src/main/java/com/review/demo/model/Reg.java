package com.review.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Reg {
	@Id
	private int userId;  
	private String uname;
	private int password;
	private int reEnterPassword;
	private String email;
	private int phoneNumber;
	private String residence;
	private String role;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getReEnterPassword() {
		return reEnterPassword;
	}
	public void setReEnterPassword(int reEnterPassword) {
		this.reEnterPassword = reEnterPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	private String Gender;
	private String Age;
	

}
