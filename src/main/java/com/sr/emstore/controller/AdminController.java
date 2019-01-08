package com.sr.emstore.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.sr.emstore.model.Product;
import com.sr.emstore.service.ProductService;
/**
 * 
 * @author santhosh
 *
 */
@Controller
public class AdminController {
	
	@Autowired
	private ProductService service;
	
	private MultipartFile multipartFile;
	private Path path;

	@RequestMapping(value="/admin/productInventory",method=RequestMethod.GET)
	public String productInventory(Model model) {
		System.out.println("addProduct page");
		List<Product> list = service.getproducts();
		model.addAttribute("products", list);
		return "productInventory";
	}
	
	@RequestMapping(value="/admin/productInventory/addProduct",method=RequestMethod.GET)
	public String addProduct(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "addProduct";
	}
	
	
	@RequestMapping(value="/admin/productInventory/deleteproduct/{productId}",method=RequestMethod.GET)
	public String addProduct(@PathVariable("productId") final int productId) {
		System.out.println(productId);
		service.deleteProduct(productId);
		return "redirect:/admin/productInventory";
	}
	
	
	@RequestMapping(value="/admin/productInventory/saveProduct",method= RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product,HttpServletRequest request) {
		System.out.println("save product page "+product.getProductName());
		int productId = service.saveProduct(product);
		multipartFile = product.getProductImage();
		String filePath = request.getSession().getServletContext().getRealPath("/");
		path = Paths.get(filePath + "//WEB-INF///resources///images//"+productId+".png");
		if(!StringUtils.isEmpty(multipartFile)) {
			try{
				System.out.println(path.toString());
				multipartFile.transferTo(new File(path.toString()));
				System.out.println(filePath);
			}catch (IllegalStateException | IOException e) {
				System.out.println("Exception "+e.getMessage());
		        throw new RuntimeException("Unable to store image file into server path "+ filePath);
			}finally {
				if(multipartFile != null) {
					multipartFile = null;
					System.out.println("finally clean resource");
				}
			}
		}
		return "redirect:/admin/productInventory";
	}
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String getAdmin() {
		System.out.println("admin page");
		return "admin";
	}
	
	public ProductService getService() {
		return service;
	}

	public void setService(ProductService service) {
		this.service = service;
	}

}
