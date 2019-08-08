package com.pms.deloitte.service;

import java.util.List;
import java.util.Optional;

import com.pms.deloitte.model.Product;

public interface ProductService {
	
	public void addProduct(Product product);
	public void deleteProduct(int productId);
	public void updateProduct (Product product);
	public Optional<Product> getProductById(int productId);
	public List<Product> getAllProducts();
	public List<Product> findByProductName(String productName);
	public List<Product>searchByPriceRange(int minimum, int maximum);
	

}
