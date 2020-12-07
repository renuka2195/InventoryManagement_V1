package io.venkey.sim.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.venkey.sim.dao.ProductDao;
import io.venkey.sim.model.Product;

@RestController
@RequestMapping("/sales")
public class SalesController {
	
	ProductDao productdao;

	@GetMapping("/totalamount")
	public List<Product> getTotal(){
			
		
		return (List<Product>) productdao.findAll();
	}
}
