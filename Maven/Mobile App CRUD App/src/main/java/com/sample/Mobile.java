package com.sample;

public class Mobile {
	int imeino;
	String brand;
	double price;
	String model;
	String color;
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Mobile( String brand, double price, String model, String color) {
		super();
//		this.imeino = imeino;
		this.brand = brand;
		this.price = price;
		this.model = model;
		this.color = color;
	}


	public int getImeino() {
		return imeino;
	}


	public void setImeino(int imeino) {
		this.imeino = imeino;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Mobile [imeino=" + imeino + ", brand=" + brand + ", price=" + price + ", model=" + model + ", color="
				+ color + "]";
	}
	
	

}
