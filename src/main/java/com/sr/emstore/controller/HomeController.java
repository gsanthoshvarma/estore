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

/**
 * @author santosh
 *
 */
@Controller
public class HomeController {
	private static final String HOME_PAGE = "home";
	private static final String PRODUCT_PAGE = "products";
	private static final String VIEW_PRODUCT = "viewProduct";

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/")
	public String home(){
		System.out.println("Controller");
		return HOME_PAGE;
	}  
	
	@RequestMapping(value="/getproducts", method=RequestMethod.GET)
	public String getProductList(Model model) {
		List<Product> products = productService.getproducts();
		System.out.println("product "+products);
		model.addAttribute("products",products);
		return PRODUCT_PAGE;
	}
	
	@RequestMapping(value="/getproducts/viewproduct/{productId}")
	public String viewProduct(@PathVariable("productId") int productId,Model model) {
		Product product = productService.getProductById(productId);
		System.out.println("product "+product.getProductName());
		model.addAttribute("product",product);
		return VIEW_PRODUCT;
	}
}
