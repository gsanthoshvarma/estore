package com.sr.emstore.po;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class ProductPO {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="productSequence")
	@SequenceGenerator(name="productSequence",sequenceName="PRODUCT_SEQ")
	@Column(name="PRODUCT_ID")
	private int productId;
	@Column(name="PRODUCT_NAME")
	private String productName;
	@Column(name="PRODUCT_CATEGORY")
	private String productCategory;
	@Column(name="DESCRIPTION")
	private String productDescription;
	@Column(name="PRODUCT_PRICE")
	private double productPrice;
	@Column(name="PRODUCT_CONDITION")
	private String productCondition;
	@Column(name="PRODUCT_STATE")
	private String productState;
	@Column(name="UNIT_IN_STOCK")
	private int unitInStock;
	@Column(name="MANFACTURE")
	private String productManfacture;
	@Embedded
	private AuditPO auditPO;
	
	
	public AuditPO getAuditPO() {
		return auditPO;
	}
	public void setAuditPO(AuditPO auditPO) {
		this.auditPO = auditPO;
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
