package com.datajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.datajpa.model.Product;
import com.datajpa.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;

	@RequestMapping(value = "saveProduct", method = RequestMethod.POST)
	public Product saveProduct(@RequestBody Product product) {

		 productService.save(product);

	}

}
