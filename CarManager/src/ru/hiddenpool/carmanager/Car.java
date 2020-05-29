package ru.hiddenpool.carmanager;

public class Car {
	String brand;
	int productionYear;
	int price;
	int weight;
	Colour colour;
	
	public Car(String brand, int productionYear, int price, int weight, Colour colour) {
		this.brand = brand;
		this.productionYear = productionYear;
		this.price = price;
		this.weight = weight;
		this.colour = colour;
	}


	@Override
	public String toString() {
		return "Car [brand=" + brand + ", productionYear=" + productionYear + ", price=" + price + ", weight=" + weight
				+ ", colour=" + colour + "]";
	}
	
	
}
