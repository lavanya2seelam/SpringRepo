package com.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class ProductId {
	private int pId;
	private String pName;
	public ProductId(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	public ProductId() {
		super();
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	@Override
	public String toString() {
		return "ProductId [pId=" + pId + ", pName=" + pName + "]";
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	

}
