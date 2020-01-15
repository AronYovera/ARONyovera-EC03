package com.idat.javawebavanzado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.idat.javawebavanzado.model.Product;
import com.idat.javawebavanzado.service.ProductService;






@Controller
@RequestMapping(value="/product")
public class ProductController {

 @Autowired
 ProductService productService;
 
 @RequestMapping(value="/list", method=RequestMethod.GET)
 public ModelAndView list() {
  ModelAndView model = new ModelAndView("product_list");
  List<Product> productList = productService.getAllProducts();
  model.addObject("productList", productList);
  
  return model;
 }
 
 @RequestMapping(value="/addProduct/", method=RequestMethod.GET)
 public ModelAndView addArticle() {
  ModelAndView model = new ModelAndView();
  
  Product product = new Product();
  model.addObject("productForm", product);
  model.setViewName("product_form");
  
  return model;
 }
 
 @RequestMapping(value="/updateArticle/{id}", method=RequestMethod.GET)
 public ModelAndView editArticle(@PathVariable long id) {
  ModelAndView model = new ModelAndView();
  
  Product product = productService.getProductById(id);
  model.addObject("productForm", product);
  model.setViewName("product_form");
  
  return model;
 }
 
 @RequestMapping(value="/saveArticle", method=RequestMethod.POST)
 public ModelAndView save(@ModelAttribute("productForm") Product article) {
  productService.saveOrUpdate(article);
  
  return new ModelAndView("redirect:/article/list");
 }
 
 @RequestMapping(value="/deleteArticle/{id}", method=RequestMethod.GET)
 public ModelAndView delete(@PathVariable("id") long id) {
  articleService.deleteArticle(id);
  
  return new ModelAndView("redirect:/article/list");
 }
}