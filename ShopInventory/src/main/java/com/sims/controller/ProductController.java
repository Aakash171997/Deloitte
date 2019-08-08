package com.sims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sims.dao.ProductDAO;
import com.sims.model.Product;

@RestController
public class ProductController {

	@Autowired
	ProductDAO simsOps;
	
	@RequestMapping("/api/getProduct")
	public String getProduct() {
		return "This is product";
	}
	
	@RequestMapping("/api/saveProduct")
	public String saveProduct() {
		Product product = new Product(1, "Ball Mouse", 5, 400);
		simsOps.save(product);
		return "Product Saved";
	}
}
