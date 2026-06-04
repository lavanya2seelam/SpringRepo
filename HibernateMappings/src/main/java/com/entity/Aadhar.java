package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Aadhar {
	@Id
	private int a_id;
	private String address;
	@OneToOne(mappedBy="aadhar",fetch = FetchType.LAZY)
	private Citizen citizen;
	public Citizen getCitizen() {
		return citizen;
	}
	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}
	public Aadhar() {
		super();
	}
	public Aadhar(int a_id, String address) {
		super();
		this.a_id = a_id;
		this.address = address;
	}
//	@Override
//  Beacause of StackOverflowError we are removing the citizen from to_sting.
	public String toString() {
		return "Aadhar [a_id=" + a_id + ", address=" + address + "]";
	}
	public int getC_id() {
		return a_id;
	}
	public void setC_id(int a_id) {
		this.a_id = a_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
