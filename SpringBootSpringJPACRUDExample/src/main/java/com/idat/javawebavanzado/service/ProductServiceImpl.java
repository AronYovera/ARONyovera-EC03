package com.idat.javawebavanzado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idat.javawebavanzado.model.Product;
import com.idat.javawebavanzado.repository.ProductRepository;


@Service
@Transactional
public class ProductServiceImpl implements ProductService {
 
 @Autowired
 ProductRepository productRepository;

 @Override
 public List<Product> getAllProduct() {
  return (List<Product>) productRepository.findAll();
 }

 @Override
 public Product getProductById(long id) {
  return productRepository.findById(id).get();
 }

 @Override
 public void saveOrUpdate(Product product) {
	 productRepository.save(product);
 }

 @Override
 public void deleteArticle(long id) {
	 productRepository.deleteById(id);
 }

}
