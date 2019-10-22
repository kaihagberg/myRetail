package com.target.myretail.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {
	private String id, name;
	@Autowired
	private Price price;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}
}
