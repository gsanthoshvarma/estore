package com.sr.emstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sr.emstore.dao.ProductDAO;
import com.sr.emstore.model.Product;
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
			Product product = new Product();
			product.setProductId(po.getProductId());
			product.setProductName(po.getProductName());
			product.setProductPrice(po.getProductPrice());
			product.setProductState(po.getProductState());
			product.setUnitInStock(po.getUnitInStock());
			product.setProductManfacture(po.getProductManfacture());
			product.setProductDescription(po.getProductDescription());
			product.setProductCondition(po.getProductCondition());
			product.setProductCategory(po.getProductCategory());
			products.add(product);
		}
		return products;
	}
	
	private Product buildProductObject(ProductPO productPO) {
			Product product = new Product();
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
		
	public Product getProductById(int id) {
		ProductPO productPO = productDAO.getProductById(id);
		return buildProductObject(productPO);
	}

}
