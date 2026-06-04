package com.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name="products")
public class Product {
	@EmbeddedId
	private ProductId product;
	private int price;
	private int quantity;
	public Product(ProductId product, int price, int quantity) {
		super();
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}
	public Product(int price, int quantity) {
		super();
		this.price = price;
		this.quantity = quantity;
	}
	public Product() {
		super();
	}
	public ProductId getProduct() {
		return product;
	}
	public void setProduct(ProductId product) {
		this.product = product;
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
		return "Product [product=" + product + ", price=" + price + ", quantity=" + quantity + "]";
	}
	

}
