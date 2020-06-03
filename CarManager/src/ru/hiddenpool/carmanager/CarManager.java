package ru.hiddenpool.carmanager;

public class CarManager {

	public static void main(String[] args) {
		
		Car prius =new Car("Toyota Prius",2008,15000,1200, Colour.GREEEN);
		
		Car renault =new Car("Renault Laguna",2000,9700,1600,Colour.WHITE);	
		
		Car renault2 =new Car("Renault Laguna",2000,9700,1600,Colour.WHITE);	
		
		prius.addDistance(1000);
		prius.addDistance(20.9);
		
 		System.out.println(prius);
		System.out.println(renault);
		
		System.out.println(prius .equals(renault2));
		System.out.println(renault .equals(renault2));
	}
}
