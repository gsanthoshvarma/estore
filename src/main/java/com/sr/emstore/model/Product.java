package com.sr.emstore.model;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

public class Product {

	private int productId;
	@NotEmpty(message="Product name should not be empty")
	private String productName;
	@NotEmpty(message="Product Category should not be empty")
	private String productCategory;
	private String productDescription;
	@Min(value = 1,message="The Product price must not be less than zero")
	private double productPrice;
	@NotEmpty(message="Product Condition should not be empty")
	private String productCondition;
	//@NotEmpty
	private String productState;
	@Min(value = 1,message="The Product stock must not be less than zero")
	private int unitInStock;
	@NotEmpty(message="Product Manfacture should not be empty")
	private String productManfacture;
	private MultipartFile productImage;
	
	public MultipartFile getProductImage() {
		return productImage;
	}
	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
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
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCondition() {
		return productCondition;
	}
	public void setProductCondition(String productCondition) {
		this.productCondition = productCondition;
	}
	public String getProductState() {
		return productState;
	}
	public void setProductState(String productState) {
		this.productState = productState;
	}
	public int getUnitInStock() {
		return unitInStock;
	}
	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	public String getProductManfacture() {
		return productManfacture;
	}
	public void setProductManfacture(String productManfacture) {
		this.productManfacture = productManfacture;
	}
	
	
	
}
