package ru.hiddenpool.carmanager;

public class CarManager {

	public static void main(String[] args) {
		
		Car prius =new Car("Toyota Prius",2008,15000,1200, Colour.GREEEN);
		
		Car renault =new Car("Renault Laguna",2000,9700,1600,Colour.WHITE);	
		
		System.out.println(prius);
		System.out.println(renault);
	}
}
