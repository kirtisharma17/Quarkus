package org.tech.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Citizen {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	Long id;
	
	String name;
	String gender;
	
	// when you add citizen then also add aadhar object so add cascade
	// if you want to get data citizen then also fatch data aadhar than use fetchType.EAGER
   
	@JsonManagedReference
	@OneToOne(mappedBy="citizen", fetch= FetchType.EAGER, cascade=CascadeType.ALL)
	Aadhar aadhar;
	
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Aadhar getAadhar() {
		return aadhar;
	}

	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
