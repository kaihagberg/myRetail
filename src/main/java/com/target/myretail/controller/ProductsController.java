package com.target.myretail.controller;

import com.target.myretail.model.Product;
import com.target.myretail.service.ProductService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/products")
public class ProductsController {

	private final ProductService productService;

	public ProductsController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("/{id}")
	@ResponseBody
	public Product getProduct(@PathVariable String id) {
		return productService.getProductById(id);
	}

}
