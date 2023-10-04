package org.tech.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Aadhar {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	Long id;
	
	Long aadharNumber;
	String company;
	
	@OneToOne
	@JsonBackReference
	Citizen citizen;

	public Aadhar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aadhar(Long id, Long aadharNumber, String company, Citizen citizen) {
		super();
		this.id = id;
		this.aadharNumber = aadharNumber;
		this.company = company;
		this.citizen = citizen;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(Long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Citizen getCitizen() {
		return citizen;
	}

	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}
	

}
