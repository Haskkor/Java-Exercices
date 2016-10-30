package com.supinfo.supcommerce.dao;

import java.util.List;

import com.supinfo.supcommerce.entity.Product;

public interface ProductDao {
	
	Product addProduct(Product product);
	Product getProductById(Long productId);
	List<Product> getAllProducts();
	List<Product> getCheaperProducts();
	void removeProduct(Product product);
	void removeProduct(Long productId);

}
