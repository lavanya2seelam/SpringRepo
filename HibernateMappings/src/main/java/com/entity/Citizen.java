package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Citizen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_id;
	@Column(nullable =  false)
	private String name;
	private int age;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="aadhar_id")
	private Aadhar aadhar;

	public Citizen(int c_id, String name, int age, Aadhar aadhar) {
		super();
		this.c_id = c_id;
		this.name = name;
		this.age = age;
		this.aadhar = aadhar;
	}

	public Citizen(String name, int age, Aadhar aadhar) {
		super();
		this.name = name;
		this.age = age;
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Citizen [c_id=" + c_id + ", name=" + name + ", age=" + age + ", aadhar=" + aadhar + "]";
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Aadhar getAadhar() {
		return aadhar;
	}

	public void setAadhar(Aadhar aadhar) {
		this.aadhar = aadhar;
	}

	public Citizen() {
		super();
	}

}
