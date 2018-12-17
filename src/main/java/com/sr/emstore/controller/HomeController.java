/**
 * 
 */
package com.sr.emstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sr.emstore.model.Product;

/**
 * @author santosh
 *
 */
@Controller
public class HomeController {
	private static final String HOME_PAGE = "home";

	@RequestMapping("/")
	public String home(){
		System.out.println("Controller");
		return HOME_PAGE;
	}  
	
	@RequestMapping(value="/getProductList", method=RequestMethod.GET)
	public String getProductList(Model model) {
		Product product = new Product();
		product.setProductName("Laptop");
		product.setProductPrice(28000.00);
		product.setProductCondition("good condition");
		product.setProductCategory("Gagest");
		product.setProductManfacture("DELL");
		product.setProductState("active");
		product.setUnitInStock(20);
		model.addAttribute(product);
		return "products";
	}
}
