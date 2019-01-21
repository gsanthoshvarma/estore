package com.sr.emstore.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sr.emstore.dao.ProductDAO;
import com.sr.emstore.model.Product;
import com.sr.emstore.po.AuditPO;
import com.sr.emstore.po.ProductPO;

@Transactional
@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	
	public List<Product> getproducts() {
		List<ProductPO> productPOs = productDAO.getProducts();
		return buildProductObject(productPOs);
	}
	
	private List<Product> buildProductObject(List<ProductPO> productPOs) {
		List<Product> products = new ArrayList<>();
		for(ProductPO po : productPOs) {
			products.add(buildProductObject(po));
		}
		return products;
	}
		
	public Product getProductById(int id) {
		ProductPO productPO = productDAO.getProductById(id);
		return buildProductObject(productPO);
	}
	
	public int saveProduct(Product product) {
		ProductPO productPO = buildProductPOObject(product);
		AuditPO auditPO = buildAudiPO();
		productPO.setAuditPO(auditPO);
		return productDAO.saveProduct(buildProductPOObject(product));
	}

	/**
	 * This method is used for build AuditPO object by default created by is "User1"
	 * @return
	 */
	private AuditPO buildAudiPO() {
		AuditPO auditPO = new AuditPO();
		auditPO.setCreatedBy("User1");
		auditPO.setCreatedDate(new Date());
		return auditPO;
	}
	
	public void deleteProduct(int productId) {
		ProductPO productPO = new ProductPO();
		productPO.setProductId(productId);
		productDAO.deleteProduct(productPO);
	}
	
	/**
	 * This method is used for build Product Model Object based on ProductPO object
	 * @param productPO
	 * @return Product
	 */
	private Product buildProductObject(ProductPO productPO) {
		Product product = new Product();
		product.setProductId(productPO.getProductId());
		product.setProductName(productPO.getProductName());
		product.setProductPrice(productPO.getProductPrice());
		product.setProductState(productPO.getProductState());
		product.setUnitInStock(productPO.getUnitInStock());
		product.setProductManfacture(productPO.getProductManfacture());
		product.setProductDescription(productPO.getProductDescription());
		product.setProductCondition(productPO.getProductCondition());
		product.setProductCategory(productPO.getProductCategory());
		return product;
	}
	
	/**
	 * This method is used for build ProductPO object based on ProductPO object
	 * @param productPO
	 * @return Product
	 */
	private ProductPO buildProductPOObject(Product product) {
		ProductPO productPO = new ProductPO();
		productPO.setProductName(product.getProductName());
		productPO.setProductPrice(product.getProductPrice());
		productPO.setProductState(product.getProductState());
		productPO.setUnitInStock(product.getUnitInStock());
		productPO.setProductManfacture(product.getProductManfacture());
		productPO.setProductDescription(product.getProductDescription());
		productPO.setProductCondition(product.getProductCondition());
		productPO.setProductCategory(product.getProductCategory());
		return productPO;
	}
	
	public ProductService() {
		super();
	}

}
