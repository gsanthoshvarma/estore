package com.sr.emstore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class AdminController {

	
	@RequestMapping(value="/admin/addProduct",method=RequestMethod.GET)
	public String addProduct() {
		System.out.println("addProduct page");
		return "addProduct";
	}
}
