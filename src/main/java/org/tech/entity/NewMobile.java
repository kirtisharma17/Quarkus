package org.tech.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NewMobile {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		Long id;
		String name;
		String brand;
		int ram;
		int externalStorage;
		
		
		public NewMobile() {
			super();
			// TODO Auto-generated constructor stub
		}
		public NewMobile(Long id, String name, String brand, int ram, int externalStorage) {
			super();
			this.id = id;
			this.name = name;
			this.brand = brand;
			this.ram = ram;
			this.externalStorage = externalStorage;
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



