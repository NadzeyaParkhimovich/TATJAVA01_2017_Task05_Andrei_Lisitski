package com.epam.bean;
public class Food {
	
	private String category;
	private String name;
	private String consist;
	private String weight;
	private int price;
	private int id;		
	
	public Food() {		
	}
	
	
	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConsist() {
		return consist;
	}

	public void setConsist(String consist) {
		this.consist = consist;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
