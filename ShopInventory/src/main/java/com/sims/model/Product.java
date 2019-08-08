package com.sims.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="HR",name="product")
public class Product {

	@Id
	private int productId;
	
	@Column
	private String productName;
	
	@Column
	private int quantity;
	
	@Column
	private int cost;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, int quantity, int cost) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.cost = cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cost;
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + quantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (cost != other.cost)
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity + ", cost="
				+ cost + "]";
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
