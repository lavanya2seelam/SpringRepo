package com.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Lavanya {
	@Id
	private int rollno;
	private String name;
	private String address;
	
	
	public Lavanya(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Lavanya [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	

}
