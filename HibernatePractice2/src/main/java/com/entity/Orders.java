package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Orders {
	@Id
	private int orderId;
	private int price;
	private int quantity;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", price=" + price + ", quantity=" + quantity + "]";
	}
	public Orders(int orderId, int price, int quantity) {
		super();
		this.orderId = orderId;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Orders() {
		super();
	}

}
