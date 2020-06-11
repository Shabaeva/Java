package ru.hiddenpool.carmanager;

public abstract class Car implements Serviceable {
	String brand;
	int productionYear;
	int price;
	int weight;
	Colour colour;
	private int distance = 0;
	protected int distanceOnService = 0;
	
	public Car(String brand, int productionYear, int price, int weight, Colour colour) {
		this.brand = brand;
		this.productionYear = productionYear;
		this.price = price;
		this.weight = weight;
		this.colour = colour;
	}
	
	public void addDistance(int additionalDistance) {
		distance +=additionalDistance;
		distanceOnService +=additionalDistance;
	}
	
	public void addDistance(double additionalDistance) {
		distance +=additionalDistance;
		distanceOnService +=additionalDistance;
	}		
	
	public int getDistance() {
		return distance;
	}	
	
	public int getDistanceOnService() {
		return distanceOnService;
	}


	@Override
	public String toString() {
		return "Car [brand=" + brand + ", productionYear=" + productionYear + ", price=" + price + ", weight=" + weight
				+ ", colour=" + colour + ", distance=" + distance + ", distanceOnService=" + distanceOnService + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + price;
		result = prime * result + productionYear;
		result = prime * result + weight;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (colour != other.colour)
			return false;
		if (price != other.price)
			return false;
		if (productionYear != other.productionYear)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	
	
}
