package ru.hiddenpool.carmanager;

public class Harvester implements Serviceable{
	String brand;
	int productionYear;
	int price;
	int weight;
	Colour colour;
	private int distance = 0;
	protected int distanceOnService = 0;
	
	
	
	@Override
	public String toString() {
		return "Harvester [brand=" + brand + ", productionYear=" + productionYear + ", price=" + price + ", weight="
				+ weight + ", colour=" + colour + ", distance=" + distance + ", distanceOnService=" + distanceOnService
				+ "]";
	}

	public Harvester(String brand, int productionYear, int price, int weight, Colour colour) {
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
	
	public boolean isReadyToService() {
		if(distanceOnService > 50000) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
}
