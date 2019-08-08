package com.pms.deloitte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.model.Product;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDAO productDAO;

	@Override
	@Transactional
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productDAO.save(product);
		
	}

	@Override
	@Transactional
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setProductId(productId);
		productDAO.delete(product);
		
	}

	@Override
	@Transactional
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDAO.save(product);
		
		
	}

	@Override
	public Optional<Product> getProductById(int productId) {
		// TODO Auto-generated method stub
		
		Optional<Product>product = productDAO.findById(productId);
		if(product.isPresent())
		{
		return product;
		}
		else
		{
			return null;
			
		}
		
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return (List<Product>)productDAO.findAll();
	}

	@Override
	public List<Product> findByProductName(String productName) {
		// TODO Auto-generated method stub
		List<Product> product = productDAO.findByProductName(productName);
		return product;
}

	@Override
	public List<Product> searchByPriceRange(int min, int max) {
		// TODO Auto-generated method stub
		List<Product> product = productDAO.findByPriceBetween(min, max);
		return product;
	}
}
