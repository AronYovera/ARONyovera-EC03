package com.idat.javawebavanzado.service;

import java.util.List;
import com.idat.javawebavanzado.model.Product;



public interface ProductService {

	public List<Product> getAllProducts();
	 
	 public Product getProductById(long id);
	 
	 public void saveOrUpdate(Product product);
	 
	 public void deleteProduct(long id);
	
}
