package com.java.hibernate;

import java.sql.Date;

import javax.persistence.*;
import javax.persistence.Table;


@Entity
@Table(name="student_address")

public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="adress_id")
	private int addressId;
	
	@Column(length = 50,name="STREET")
	private String street;
	@Column(length=50,name="CITY")
	private String city;
	
	@Column(name="is_Open")
	private boolean isOpen;
	
	@Transient
	private double x;
	
//	
//	@Column(name="added_date")
//	
//	 @Temporal(TemporalType.DATE)
//	private java.util.Date addedDate;
	
	@Lob
	private byte[] image;
	
	public Address() {
		super( );
	}

	public Address(int addressId, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
//		this.addedDate = addedDate;
		this.image = image;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

//	public java.util.Date getAddedDate() {
//		return addedDate;
//	}
//
//	public void setAddedDate(Date date) {
//		this.addedDate = date;
//	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	
	
	

}