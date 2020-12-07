package io.venkey.sim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.venkey.sim.dao.ProductDao;
import io.venkey.sim.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController{

	@Autowired
	public ProductDao productdao;
	
	@PostMapping("/addproduct")
	public String addProduct(@RequestBody List<Product> products) {
		productdao.saveAll(products);
		return "products added:"+ products.size();
	}
	
	@GetMapping("/getproduct")
	public List<Product> getProduct(){
		
		return (List<Product>) productdao.findAll();
	}
	
}
