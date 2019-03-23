package com.datajpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datajpa.model.Product;
import com.datajpa.repository.ProductRepository;
import com.datajpa.service.ProductService;

@Service
public class ProductServiceImpl  implements ProductService{
	
	@Autowired
	ProductRepository  productRepository;

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

}
