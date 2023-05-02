package com.review.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Disease {
	@Id
	private int num;
	private String name;
	private String year;
	private String country;
	private String symptoms;
	private String cure;
	private String death;
	private String recovered;
	private String agegrp;
	private String vaccine;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getCure() {
		return cure;
	}
	public void setCure(String cure) {
		this.cure = cure;
	}
	public String getDeath() {
		return death;
	}
	public void setDeath(String death) {
		this.death = death;
	}
	public String getRecovered() {
		return recovered;
	}
	public void setRecovered(String recovered) {
		this.recovered = recovered;
	}
	public String getAgegrp() {
		return agegrp;
	}
	public void setAgegrp(String agegrp) {
		this.agegrp = agegrp;
	}
	public String getVaccine() {
		return vaccine;
	}
	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}
	
	
	
}
