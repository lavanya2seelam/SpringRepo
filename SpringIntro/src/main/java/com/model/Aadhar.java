package com.model;

public class Aadhar {
	
	private int a_id;
	private String address;
	public Aadhar(int a_id, String address) {
		super();
		this.a_id = a_id;
		this.address = address;
	}
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Aadhar [a_id=" + a_id + ", address=" + address + "]";
	}
	
}
