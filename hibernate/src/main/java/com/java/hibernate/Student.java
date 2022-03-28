package com.java.hibernate;

import javax.persistence.Cacheable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


//entity treats Student like entity in table in sql

@Entity 
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)

public class Student {
	
	//id creates primary keys
	@Id
	private int id;
	
	private String name;
	private String city;
	
	
	private Certificate certi;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
			
		public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	
	
		public String toString() {
			return this.id+" : "+this.name+" : "+this.city;
			
		}
		
}
