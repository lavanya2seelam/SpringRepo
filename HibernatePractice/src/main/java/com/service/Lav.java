package com.service;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lavanya")
public class Lav {
	@Id
	@Column(name = "rollno")
	private int roll;
	private String name;
	private String address;
	
	public Lav() {
		super();
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Lav(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Lav(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Lav [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	

}
