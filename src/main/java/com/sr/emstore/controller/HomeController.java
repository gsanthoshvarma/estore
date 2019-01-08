/**
 * 
 */
package com.sr.emstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sr.emstore.model.Product;
import com.sr.emstore.service.ProductService;
import com.sr.emstore.util.PageConstants;

/**
 * @author santosh
 *
 */
@Controller
public class HomeController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/")
	public String home(){
		System.out.println("Controller");
		return PageConstants.HOME_PAGE;
	}  
	
	@RequestMapping(value="/getproducts", method=RequestMethod.GET)
	public String getProductList(Model model) {
		List<Product> products = productService.getproducts();
		System.out.println("product "+products);
		model.addAttribute("products",products);
		return PageConstants.PRODUCT_PAGE;
	}
	
	@RequestMapping(value="/getproducts/viewproduct/{productId}")
	public String viewProduct(@PathVariable("productId") int productId,Model model) {
		Product product = productService.getProductById(productId);
		System.out.println("product "+product.getProductName());
		model.addAttribute("product",product);
		return PageConstants.VIEW_PRODUCT;
	}
}
