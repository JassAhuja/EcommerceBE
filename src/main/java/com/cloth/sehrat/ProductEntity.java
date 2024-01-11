package com.cloth.sehrat;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "productDetails")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long id;
	
	private String name;
	private String size;
	private int price;
	private String color;
	private int quantity;
	private String description;
	private String imgSrc;
	
	public ProductEntity() {	}
	
	
	public ProductEntity(String name, String size, int price, String color, int quantity, String description, String imgSrc) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
		this.color = color;
		this.quantity = quantity;
		this.description = description;
		this.imgSrc = imgSrc;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	@Override
	public String toString() {
		return "Entity [name=" + name + ", size=" + size + ", price=" + price + ", color=" + color + ", quantity="
				+ quantity + ", description=" + description + ", imgSrc=" + imgSrc + "]";
	}
	
	
	
	
}
