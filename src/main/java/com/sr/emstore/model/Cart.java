package com.sr.emstore.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {

	private String cartId;
	private Map<String, CartItem> cartItems;
	private double grandTotal;

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public Map<String, CartItem> getCartItems() {
		return cartItems == null ? new HashMap<>() : cartItems;
	}

	public void setCartItems(Map<String, CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

}
