package org.tech;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Mobile extends PanacheEntity {
	
	String name;
	String brand;
	int ram;
	int externalStorage;
	public Mobile( String name, String brand, int ram, int externalStorage) {
		super();
		
		this.name = name;
		this.brand = brand;
		this.ram = ram;
		this.externalStorage = externalStorage;
	}
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getExternalStorage() {
		return externalStorage;
	}
	public void setExternalStorage(int externalStorage) {
		this.externalStorage = externalStorage;
	}
	

}
