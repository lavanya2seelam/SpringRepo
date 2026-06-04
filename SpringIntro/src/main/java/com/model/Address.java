package com.model;

public class Address {
	
	int pincode;
	String street;
	public Address(int pincode, String street) {
		super();
		this.pincode = pincode;
		this.street = street;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", street=" + street + "]";
	}

}
