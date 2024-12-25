package com.Upwardiq.Pavithra.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long productId;
	private String productName;
	private String productType;
	private String productPrice;
	private String productDate;
	public Product(long id, long productid, String productname, String producttype, String productprice,
			String productdate) {
		super();
		this.id = id;
		this.productId = productid;
		this.productName = productname;
		this.productType = producttype;
		this.productPrice = productprice;
		this.productDate = productdate;
	}
	public String getProductDate() {
		return productDate;
	}
	public void setProductDate(String productdate) {
		this.productDate = productdate;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productid) {
		this.productId = productid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productname) {
		this.productName = productname;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String producttype) {
		this.productType = producttype;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productprice) {
		this.productPrice = productprice;
	}
	
	public Product() {
		
	}
	
}
