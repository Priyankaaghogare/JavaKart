package com.model;

public class Product implements Comparable<Product> {
	
	private int id;
	private String name;
	private String des;
	private float ratings;
	private int price;
	
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", des=" + des + ", ratings=" + ratings + ", price=" + price
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int compareTo(Product o) {
		return Integer.compare(this.id,o.id);
	}
	
}

