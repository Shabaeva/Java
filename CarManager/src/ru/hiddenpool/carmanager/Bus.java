package ru.hiddenpool.carmanager;

public class Bus extends Car {

	public Bus(String brand, int productionYear, int price, int weight, Colour colour) {
		super(brand, productionYear, price, weight, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isReadyToService() {
		if(distanceOnService > 50000) {
			return true;
		}else {
			return false;
		}
	}
	

}
