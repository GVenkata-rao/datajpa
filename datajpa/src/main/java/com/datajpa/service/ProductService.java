package com.datajpa.service;

import java.util.List;

import com.datajpa.model.Product;

public interface ProductService {
	
	public Product save(Product product);

	public List<Product> productList();
}
