package com.pms.deloitte.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.model.Product;
import com.pms.deloitte.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	@RequestMapping("/getProductById/{pId}")
	public Optional<Product> getProductById(@PathVariable("pId")Integer productId)

	{
		return productService.getProductById(productId);

	}

	@RequestMapping("/addProduct")
	public String addProduct()
	{

		Product product = new Product(111,"Bottle",1000,205);
		productService.addProduct(product);

		return "Product added to database";
	}
	@RequestMapping("/deleteProduct/{pId}")
	public String deleteProduct(@PathVariable("pId")Integer productId)
	{
		productService.deleteProduct(productId);
		return "product deleted";	

	}

	@RequestMapping("/updateProduct/")
	public String updateProduct()
	{
		return "product details updated";
	}

	@RequestMapping("/getAllProducts")
	public List <Product> getAllProducts()
	{
		List <Product> products = productService.getAllProducts();
		return products;
	}

	@RequestMapping("/getProductByName/{pId}")
	public List <Product> getProductByName(@PathVariable("pId")String productName)
	{

		List<Product> products = productService.findByProductName(productName);
		return products;


	}
	@RequestMapping("/searchProducts/{min}/{max}")
	public List<Product> getAllProducts(@PathVariable("min")Integer min,@PathVariable("max") Integer max)
	{List <Product> products = productService.searchByPriceRange(min, max);


	return products;

	}
	
	@RequestMapping("/product")
	public String getProductModel(Model model)
	{
		
		model.addAttribute("product", new Product());
		return "product";
		
		
		
	}

}
