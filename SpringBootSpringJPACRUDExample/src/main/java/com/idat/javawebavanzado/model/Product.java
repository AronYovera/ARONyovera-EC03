package com.idat.javawebavanzado.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 
	 @Column(name="name")
	 private String name;
	 
	 @Column(name="category")
	 private String category;
	 
	 @Column(name="stock")
	 private String stock;
	 
	 @Column(name="price")
	 private String price;

	 public long getId() {
	  return id;
	 }

	 public void setId(long id) {
	  this.id = id;
	 }

	 public String getName() {
	  return name;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public String getCategory() {
	  return category;
	 }

	 public void setCategory(String category) {
	  this.category = category;
	 }
	 
	 public String getStock() {
		  return stock;
     }

     public void setStock(String stock) {
		  this.stock =stock;
	 }
     
     public String getPricey() {
   	  return price;
   	 }

   	 public void setPrice(String price) {
   	  this.price = price;
   	 }

}
