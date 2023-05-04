package com.diseaseDatabase.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Demographics {
	@Id
	@GeneratedValue
	private int id;
	private String bloodgrp;
	@Override
	public String toString() {
		return "Demographics [id=" + id + ", bloodgrp=" + bloodgrp + ", height=" + height + ", weight=" + weight + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBloodgrp() {
		return bloodgrp;
	}
	public void setBloodgrp(String bloodgrp) {
		this.bloodgrp = bloodgrp;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	private String height;
	private String weight;

}
